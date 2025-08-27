SELECT teacher_id, COUNT(DISTINCT subject_id) As cnt
FROM Teacher
GROUP BY teacher_id
ORDER BY teacher_id;
