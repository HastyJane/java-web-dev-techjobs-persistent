## Part 1: Test it with SQL
idjob - int PK
id - int
employer - varChar(255)
name - varChar(255)
skills - varChar(255)

## Part 2: Test it with SQL
SELECT name FROM employer WHERE location="St. Louis City";
## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT skill.name, skill.description
FROM skill
INNER JOIN job_skills
ON skill.id = job_skills.skills_id
INNER JOIN job
ON job_skills.jobs_id = job.id
ORDER BY skill.name