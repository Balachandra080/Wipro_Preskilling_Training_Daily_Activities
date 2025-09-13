create table employees(empid int,name varchar(30),hireddate date);
/*
 DML(Data Manupulation Language)
 INSERT
 UPDATE
 DELETE 
*/ 
-- go and DELETE that table -- > DROP
insert into employees values (1,'renu','2024-08-19'); 

insert into employees(empid,name) values (2,'Sexa');

insert into employees values (3,'Hemu',null);

select * from employees;
SHOW tables;
create table menu(itemid int,name varchar(30),rate  int);
SHOW tables;
drop table menu;
SHOW tables;
insert into employees values (4,'Puddy',current_date()),(5,'venkat',null);
select * from employees;
SET SQL_SAFE_UPDATES = 0;

DELETE FROM employees WHERE empid = 4;

SET SQL_SAFE_UPDATES = 1;  -- Re-enable safe update mode

select * from employees;

SET SQL_SAFE_UPDATES = 0;
DELETE FROM employees WHERE empid = 5;
SET SQL_SAFE_UPDATES = 1;  -- Re-enable safe update mode

select * from employees;

insert into employees values(4,'puddy',current_date()),(5,'venkat',null);

update employees set name ='Bhai' where empid=1;
update employees set name='allen',hireddate=current_date() where empid>2;










 
 