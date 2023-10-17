# Write your MySQL query statement below
SELECT *, CASE WHEN x + y > z AND ABS(x - y) < z THEN 'Yes' ELSE 'No' END AS triangle
FROM Triangle;
