package com.gl.jpa.controller;

import com.gl.jpa.model.Student;
import com.gl.jpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student/add")
    public ResponseEntity<?> add(@RequestParam String name, @RequestParam int age) {
        Student student = studentService.add(name, age);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error in creating student");
        }
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @PostMapping("/student/mapcourse")
    public ResponseEntity<?> mapCourse(@RequestParam int studentId, @RequestParam int courseId) {
        Student student = studentService.assignCourse(studentId, courseId);
        if (student == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error in mapping the course");
        }
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }
}
