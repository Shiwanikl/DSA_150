# Write your MySQL query statement below
select e.name, b.bonus
from Employee e 
left join Bonus b
On e.empId = b.empId
where b.Bonus <1000
or b.Bonus is null;