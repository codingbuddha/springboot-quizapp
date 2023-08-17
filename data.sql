DROP TABLE IF EXISTS question;

CREATE TABLE question (
    id SERIAL PRIMARY KEY,   
	difficulty_level varchar(25) DEFAULT NULL,
	option1 varchar(255) DEFAULT NULL,
	option2 varchar(255) DEFAULT NULL,
    option3 varchar(255) DEFAULT NULL,
    option4 varchar(255) DEFAULT NULL,
    question_title varchar(255) DEFAULT NULL,
    right_answer varchar(255) DEFAULT NULL
);

insert into question 
(option1, option2, option3, option4, question_title, right_answer, difficulty_level)
values ('easy', 'delhi', 'mumbai', 'kolkata', 'What is the capital of india', 'delhi', 'easy');

insert into question 
(option1, option2, option3, option4, question_title, right_answer, difficulty_level)
values ('easy', 'delhi', 'mumbai', 'kolkata', 'What is the capital of india', 'delhi', 'medium');

insert into question 
( option1, option2, option3, option4, question_title, right_answer, difficulty_level)
values ('easy', 'delhi', 'mumbai', 'kolkata', 'What is the capital of india', 'delhi', 'hard');

insert into question 
(option1, option2, option3, option4, question_title, right_answer, difficulty_level)
values ('easy', 'delhi', 'mumbai', 'kolkata', 'What is the capital of india', 'delhi', 'easy');

insert into question 
(option1, option2, option3, option4, question_title, right_answer, difficulty_level)
values ('easy', 'delhi', 'mumbai', 'kolkata', 'What is the capital of india', 'delhi', 'easy');

select *
from question;