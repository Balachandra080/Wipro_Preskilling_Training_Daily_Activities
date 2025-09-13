
create database sample123;

use sample123;

create table student(
	name varchar(100),
    age int,
    student_number int
);

create table product(
	name varchar(50),
    price decimal(5,2)
);

desc student;

insert into student (name, age, student_number) values("Bala", 20, 203);

insert into student (name, age, student_number) values ("kumar", 20, 202),
     ("Raj", 20, 204),
     ("Arpana", 20, 205),
     ("Chandra", 20, 206),
     ("Navya", 20, 207);
     
select * from student;

/* Primary key - Column must not have repeating values */

create table employee (
     emp_number int primary key,
     name varchar(100)
);

desc employee;

insert into employee (emp_number, name) values (101, "Raghu");
insert into employee (emp_number, name) values (101, "Aktar");

create table course (
	course_code int primary key,
    name varchar(50),
    fee int,
    trainer varchar(100),
    sessions int,
    start_date date
);

insert into course (course_code, name, fee, sessions) values (101, "java", 10000, 50);
select * from course;

create table citizen (
     pan_number varchar(100) primary key, /* non repeating - unique + not null */
     name varchar(100) not null, /* mandatory */
     age int,
     aadhar_number varchar(100) unique /* unique - but can accept null */
);

insert into citizen (pan_number, name, age, aadhar_number) values ("AA34545", "ashok", 22, 54676);
insert into citizen (pan_number, name, age) values ("TY677878", "aRaj", 22);
select* from citizen;