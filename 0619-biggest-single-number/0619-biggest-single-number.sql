# Write your MySQL query statement below
SELECT MAX(W.num) AS num
FROM
(SELECT num
FROM MyNumbers
GROUP BY num
HAVING COUNT(num)<2) AS W