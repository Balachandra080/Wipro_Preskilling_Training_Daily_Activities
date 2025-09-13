-- Step 1: Create database
create database wipro_2025_java_web;

-- Step 2: Switch to that database
use wipro_2025_java_web;

-- Step 3: Create table
create table product (
    id int auto_increment primary key,
    name varchar(100),
    price double(6, 2),
    discount double(6, 2),
    unit double(6, 2)
);

-- Step 4: Describe table
desc product;

-- Step 5: Select all rows
select * from product;
