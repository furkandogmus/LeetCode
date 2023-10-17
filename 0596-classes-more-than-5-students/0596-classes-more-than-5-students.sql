# Write your MySQL query statement below
SELECT W.class FROM 
(SELECT class, COUNT(class) as NumStudent
 FROM Courses
 GROUP BY class) as W
 WHERE W.NumStudent>=5