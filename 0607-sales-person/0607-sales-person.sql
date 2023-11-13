# Write your MySQL query statement below

SELECT p2.name FROM SalesPerson p2
WHERE p2.name NOT IN 
(SELECT p.name
FROM SalesPerson as p
LEFT JOIN (SELECT o.order_id, c.name,o.sales_id
FROM Orders o
INNER JOIN Company c
ON o.com_id = c.com_id) as W
ON W.sales_id = p.sales_id
WHERE W.name = "RED")