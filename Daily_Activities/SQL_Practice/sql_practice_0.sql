use sample1234;
insert into course (course_code, name, fee, trainer, sessions, start_date) values
	(111, "Java Spring boot", 1000, 'Trainer 1', 50, "2025-08-01"),
    (112, "Spring boot", 1000, 'Trainer 2', 50, "2025-08-01"),
    (113, "React JS", 1000, 'Trainer 3', 50, "2025-08-01");
    select * from course;
    
    update course set fee=10000 where course_code=104;
    
    update course set trainer ="trainer 3",sessions=20 where course_code=103;
    set sql_safe_updates = 0;
    update course set trainer ="trainer 3" where name like '%spring%';
    
    
    /*removing data*/
    
    delete from course where course_code=107;
    delete from course;
    
    drop table course;  /*data+table*/

    
    
    
    
    