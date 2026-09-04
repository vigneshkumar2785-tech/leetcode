# Write your MySQL query statement below
with run_total as
    (
        select
             person_id,
             person_name,
             turn,
             sum(weight) over(order by turn) as total_weight
             from Queue
    )

select 
    person_name 
    from run_total
    where total_weight <=1000
    order by turn desc limit 1
