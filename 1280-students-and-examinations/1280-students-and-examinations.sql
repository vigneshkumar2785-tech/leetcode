# Write your MySQL query statement below
select 
    stu.student_id, stu.student_name, sub.subject_name, count(Ex.student_id) attended_exams
from Students stu
cross join Subjects sub  
left join Examinations Ex
     on stu.student_id = Ex.student_id and 
     sub.subject_name = Ex.subject_name 
group by stu.student_id, stu.student_name, sub.subject_name 
order by stu.student_id, stu.student_name, sub.subject_name