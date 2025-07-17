SELECT *
FROM Cinema
WHERE id % 2 = 1             
  AND description != 'boring' 
  AND rating > 2.0         
ORDER BY rating DESC;         
