create table department(
 id int primary key,
 name varchar(50)
 );
 
 create table degree(
 id int primary key,
 name varchar(50)
 );
 
 create table students(
    id int primary key,
    name varchar(50),
    age int ,
    dob date,
    department_id int,
    degree_id int,
    
    foreign key(department_id) references department(id),
    foreign key(degree_id) references degree(id)
    );
    
    
    
    
 
 