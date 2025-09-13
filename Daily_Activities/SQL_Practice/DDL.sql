create database hr_info; -- we created the database hr_info
/*
DDL (Data Definition Language)
1)CREATE
2)ALTER
    add
	modify
	rename
	drop
3)RENAME
DROP
-------------------------


*/

use hr_info;
create table employees(empid int,name varchar(20),hireddate date);
alter table employees add salary int;
desc employees;

alter table employees add phone_no int , add mail_id varchar(30); -- method 1

alter table employees add (phone_no int , mail_id varchar(30)); -- method 2

# if we want to change the column name of existing column in a table we can use rename key word
alter table employees rename column empid to id;
alter table employees rename column name to ename , rename column phone_no to contact_no;

desc employees;

-- To change the variable data type we use modify  through alter statement
alter table employees modify id varchar(10);

-- To drop a column we use drop along with alter statement 
alter table employees drop column ename;
alter table employees drop id;

show tables;

-- To change the existing table name we use rename in DDL
rename table employees to new_emp;
desc new_emp;

-- To add new column that should be placed first we will use first keyword

alter table new_emp add sr_no int first;
alter table new_emp add alternate_ph_no int after contact_no;  # No  before 
alter table new_emp modify hireddate date after alternate_ph_no;

-- Deadliest command is drop 
drop table new_emp;

show tables;

-- Again creating table in hr_info database
create table employees(empid int,name varchar(20),hireddate date);
desc employees;
alter table employees  modify name varchar(20) after hireddate;



