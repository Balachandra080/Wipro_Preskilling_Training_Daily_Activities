package com.gl.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gl.security.service.ApiService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final ApiService apiService;

    public CategoryController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping
    public String listCategories(Model model) {
        model.addAttribute("categories", apiService.listCategories());
        return "browseCategories";
    }
}

