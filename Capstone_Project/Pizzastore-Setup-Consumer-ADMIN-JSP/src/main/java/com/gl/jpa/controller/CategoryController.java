package com.gl.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.gl.jpa.service.ApiService;

@Controller
public class CategoryController {

    private final ApiService apiService;

    public CategoryController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/categories")
    public String showCategories(Model model) {
        model.addAttribute("categories", apiService.getCategories());
        return "categories"; // ✅ This will map to categories.jsp
    }
}
