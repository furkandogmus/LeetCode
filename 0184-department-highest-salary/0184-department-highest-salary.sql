# Write your MySQL query statement below
SELECT W.Department, e2.name as Employee, W.Salary
FROM Employee e2 LEFT JOIN
(SELECT MAX(e.salary) as Salary, d.id as id, d.name as Department
FROM Employee e
LEFT JOIN Department d
ON e.departmentId = d.id
GROUP BY d.name) as W
ON e2.departmentId = W.id
WHERE W.Salary = e2.salary