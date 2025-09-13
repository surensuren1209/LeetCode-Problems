# Write your MySQL query statement below
select S.score ,COUNT(S2.SCORE) as `rank` from SCORES S,
(select distinct SCORE from SCORES)  S2
where S.SCORE<=S2.SCORE 
group by S.ID 
order by S.SCORE desc;