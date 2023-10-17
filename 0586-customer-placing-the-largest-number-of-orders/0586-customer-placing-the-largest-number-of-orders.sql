# Write your MySQL query statement below
SELECT W.customer_number
FROM (SELECT customer_number , COUNT(order_number) AS NumOrd
FROM Orders
GROUP BY customer_number
ORDER BY NumOrd DESC
LIMIT 1) 
AS W