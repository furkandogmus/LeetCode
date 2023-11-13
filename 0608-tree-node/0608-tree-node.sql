# Write your MySQL query statement below

SELECT DISTINCT
  W.parent_id AS id,
  CASE
    WHEN W.has_parent IS NULL THEN 'Root'
    WHEN W.child_id IS NULL THEN 'Leaf'
    ELSE 'Inner'
  END AS type
FROM (
  SELECT t1.id AS parent_id, t2.id AS child_id, t1.p_id AS has_parent
  FROM Tree t1
  LEFT JOIN Tree t2 ON t1.id = t2.p_id
) AS W;

# parent_id  child_id
#     1           3
#     1           2
#     2           5
#     2           4
#     3           null
#     4           null
#     5           null