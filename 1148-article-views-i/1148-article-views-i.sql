# Write your MySQL query statement below
SELECT DISTINCT V1.author_id AS id
FROM Views V1, Views V2
WHERE V1.author_id = V2.author_id AND V1.author_id=V2.viewer_id AND V1.viewer_id = V2.viewer_id
ORDER BY V1.author_id ASC