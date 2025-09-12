package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    // Simple sample page
    @RequestMapping("/sample")
    public String sample() {
        return "sample";   // this will go to sample.jsp
    }

    // API for adding two numbers
    @GetMapping("/add")
    public String add(@RequestParam("a") int a, 
                      @RequestParam("b") int b, 
                      Model model) {
        int c = a + b;
        System.out.println("c = " + c);
        model.addAttribute("answer", c);
        return "add";   // this will go to add.jsp
    }
}
