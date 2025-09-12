package com.gl.controller;



import java.util.List;       
import java.util.ArrayList; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController 
{

    @RequestMapping("/student")
    public String testStudent(Model model) 
    {
        Student s1 = new Student("Rani", 20);

        // Put object in model
        model.addAttribute("rani", s1);

        return "showstudent";  // goes to showstudent.jsp
    }
    
 // List of students
    @RequestMapping("/student/list")
    public String testListStudent(Model model) 
    {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("s1", 10));
        studentList.add(new Student("s2", 11));
        studentList.add(new Student("s3", 12));
        studentList.add(new Student("s4", 13));

        // Put list in model
        model.addAttribute("studentlist", studentList);

        return "showstudentlist"; // goes to showstudentlist.jsp
    }
}
