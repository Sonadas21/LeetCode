# Write your MySQL query statement below
select emp1.name as Employee from employee emp1 inner join employee emp2 on emp2.id = emp1.managerId
where emp1.salary > emp2.salary ;