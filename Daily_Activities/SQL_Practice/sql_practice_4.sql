create database wipro_2025_java_web;

use wipro_2025_java_web;

create table product (
	id int auto_increment primary key,
    name varchar(100),
    price double(6, 2),
    discount double(6, 2),
    unit double(6, 2)
);

desc product;

select * from product;

create table movie (
	id int auto_increment primary key,
    name varchar(100),
    budget double(6, 2),
    length double(6, 2)
);    
desc movie;

select * from movie;

create table book(
id int,
name varchar(50),
author varchar(50),
price int
);
desc book;
select * from book;
show tables;
desc mobile;

alter table mobile drop column hdd;
select * from aadhar;
select * from hotel;

create table hotel (
	id int auto_increment primary key,
    name varchar(100),
    address varchar(100)
);

create table simcard (
	id int auto_increment primary key,
    company varchar(100),
    plan varchar(100)
);