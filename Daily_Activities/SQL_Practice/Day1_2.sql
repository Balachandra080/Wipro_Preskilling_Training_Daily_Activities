create database sample123;
use sample123;
create table course (
	course_code int primary key,
    name varchar(50),
    fee int,
    trainer varchar(100),
    sessions int,
    start_date date
);

insert into course (course_code, name, fee, trainer, sessions, start_date) values
	(102, "Java", 1000, 'Trainer 1', 50, "2025-08-01"),
    (103, "PYthon", 2000, 'Trainer 2', 60, "2025-08-02"),
    (104, "AI", 1500, 'Trainer 3', 45, "2025-08-03"),
    (105, "MERN", 2500, 'Trainer 1', 16, "2025-08-10"),
    (106, "React", 1000, 'Trainer 2', 25, "2025-08-12"),
    (107, "English", 1500, 'Trainer 3', 30, "2025-08-08"),
    (108, "PHP", 3000, 'Trainer 1', 50, "2025-08-01"),
    (109, "GO", 4500, 'Trainer 1', 50, "2025-08-09"),
    (110, "Maths", 1250, 'Trainer 2', 40, "2025-08-14")
    ;
    
select * from course;

select fee, sessions, name, fee from course;
/* we can change the order of the output - by default it is ascending order */
select * from course order by sessions;
select * from course order by sessions desc;

/* filter options */
/* i want the courses which are above 1500 fee */
select * from course where fee > 1500;
select name, fee from course where fee >= 1500 order by fee;

/* i want the course which are aboove 1500 and sessions are less than 20 */
select * from course where fee >= 1500 and sessions <= 20;
/* i want the course which are aboove 1500 or sessions are less than 20 */
select * from course where fee >= 1500 or sessions <= 20;

