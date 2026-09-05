# Write your MySQL query statement below
with ranked as(
select 
    id, 
    name,
    salary,
    departmentId,
    dense_rank() over(
        partition by departmentId order by salary desc 
    ) as ranks from Employee
    )
    select
        d.name department,
        r.name Employee,
        r.salary Salary
        from ranked r join
        Department d
        on r.departmentId = d.id
        where r.ranks <=3