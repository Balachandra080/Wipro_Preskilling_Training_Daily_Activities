create database learn_fk;

use learn_fk;

create table gender (
    id int primary key,
    name varchar(10) unique
);

create table blood (
    id int primary key,
    name varchar(10) unique
);

create table employee (
    id int primary key,
    name varchar(50),
    gender_id int,
    blood_group_id int,
    address varchar(100)
);