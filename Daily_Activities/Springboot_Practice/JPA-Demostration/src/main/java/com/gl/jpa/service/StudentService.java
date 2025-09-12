package com.gl.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.jpa.model.Student;
import com.gl.jpa.model.Course;
import com.gl.jpa.repo.StudentRepo;
import com.gl.jpa.repo.CourseRepo;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepo studentRepo;
    
    @Autowired
    private CourseRepo courseRepo;

    // Add a new student
    public Student add(String name, int age) {
        Student student = new Student(name, age);
        return studentRepo.save(student);
    }

	public Student assignCourse(int studentId, int courseId) {
	    // fetch student
	    Optional<Student> studentOpt = studentRepo.findById(studentId);
	    if (studentOpt.isEmpty()) {
	        return null; // or throw exception
	    }

	    // fetch course
	    Optional<Course> courseOpt = courseRepo.findById(courseId);
	    if (courseOpt.isEmpty()) {
	        return null; // or throw exception
	    }

	    // map the course to the student
	    Student student = studentOpt.get();
	    // assuming Student has getCourses() that returns a List or Set
	    student.getCourses().add(courseOpt.get());

	    // save updated student
	    studentRepo.save(student);

	    return student;
	}


}
