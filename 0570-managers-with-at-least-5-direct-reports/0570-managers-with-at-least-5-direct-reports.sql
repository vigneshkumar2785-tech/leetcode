# Write your MySQL query statement below
select e1.name from Employee e1 join(
select managerId from Employee group by managerid having count(*) >= 5) m
on e1.id = m.managerId