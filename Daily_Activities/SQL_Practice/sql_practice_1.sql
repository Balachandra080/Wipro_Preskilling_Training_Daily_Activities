create database learn_fk;
use learn_fk;

create table gender(
    id int primary key,
    name varchar(50) unique
    );
    
    create table blood_group(
    id int primary key,
    name varchar(50) unique
    );
    
    create table employee(
       id int primary key,
       name varchar(50),
       gender_id int,
       blood_group_id int,
       address varchar(50),
       
       foreign key (gender_id) references gender(id),
       foreign key (blood_group_id) references blood_group(id)
       );
       
       show tables;
       
insert into blood_group (id, name) values (1, "A+");

insert into blood_group (id, name) values (2, "B+");

insert into gender (id, name) values (1, "male");

insert into gender (id, name) values (2, "female");

insert into gender (id, name) values (3, "others");

insert into employee (id, name, gender_id, blood_group_id, address) values (1, "el", 1, 1, "al");


select*from employee;

create table country(
   id int primary key,
   name varchar(50)
   );
   
   create table country(
   id int primary key,
   name varchar(50)
   );

create table country(
   id int primary key,
   name varchar(50)
   );

select employee.id,employee.name,blood_group.name from employee join blood_group on employee.blood_group_id=blood.id;