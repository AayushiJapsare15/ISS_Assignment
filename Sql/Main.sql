CREATE DATABASE college;
USE college;

CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT CHECK (age >= 18),
    email VARCHAR(50) UNIQUE,
    marks INT DEFAULT 0,
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES department(dept_id)
);

INSERT INTO department VALUES
(1, 'Computer Science'),
(2, 'Data Science');

INSERT INTO student (name, age, email, marks, dept_id) VALUES
('Aayushi', 21, 'aayushi@gmail.com', 85, 1),
('Rahul', 22, 'rahul@gmail.com', 78, 1),
('Neha', 23, 'neha@gmail.com', 92, 2),
('Riya', 21, NULL, 70, 2);

SELECT * FROM student;

SELECT DISTINCT dept_id FROM student;

SELECT * FROM student WHERE marks > 80;

SELECT * FROM student WHERE marks > 80 AND age > 21;

SELECT * FROM student WHERE marks > 90 OR age < 22;

SELECT * FROM student ORDER BY marks ASC;
SELECT * FROM student ORDER BY marks DESC;

SELECT * FROM student WHERE name LIKE 'A%';
SELECT * FROM student WHERE email LIKE '%gmail%';

SELECT * FROM student WHERE dept_id IN (1, 2);

SELECT * FROM student WHERE marks BETWEEN 80 AND 90;

SELECT name AS StudentName, marks AS Score FROM student;

UPDATE student SET marks = 95 WHERE name = 'Aayushi';

DELETE FROM student WHERE name = 'Riya';

SELECT s.name, d.dept_name
FROM student s
INNER JOIN department d
ON s.dept_id = d.dept_id;

SELECT s.name, d.dept_name
FROM student s
LEFT JOIN department d
ON s.dept_id = d.dept_id;

SELECT s.name, d.dept_name
FROM student s
RIGHT JOIN department d
ON s.dept_id = d.dept_id;

SELECT s.name, d.dept_name
FROM student s
LEFT JOIN department d ON s.dept_id = d.dept_id
UNION
SELECT s.name, d.dept_name
FROM student s
RIGHT JOIN department d ON s.dept_id = d.dept_id;

SELECT dept_id, AVG(marks) AS AvgMarks
FROM student
GROUP BY dept_id;

SELECT dept_id, AVG(marks) AS AvgMarks
FROM student
GROUP BY dept_id
HAVING AVG(marks) > 80;

SELECT * FROM student WHERE email IS NULL;

SELECT IFNULL(email, 'No Email') FROM student;

SELECT COUNT(*) FROM student;
SELECT MAX(marks) FROM student;
SELECT MIN(marks) FROM student;
SELECT SUM(marks) FROM student;
SELECT AVG(marks) FROM student;

CREATE INDEX idx_marks ON student(marks);

CREATE VIEW student_view AS
SELECT name, marks FROM student;

SELECT * FROM student_view;

ALTER TABLE student ADD COLUMN city VARCHAR(30);

ALTER TABLE student MODIFY city VARCHAR(50);

DROP VIEW student_view;
-- DROP TABLE student;
-- DROP DATABASE college;

CREATE TABLE topper (
    name VARCHAR(50),
    marks INT
);

INSERT INTO topper
SELECT name, marks FROM student WHERE marks > 90;

SELECT name FROM student
UNION
SELECT name FROM topper;
