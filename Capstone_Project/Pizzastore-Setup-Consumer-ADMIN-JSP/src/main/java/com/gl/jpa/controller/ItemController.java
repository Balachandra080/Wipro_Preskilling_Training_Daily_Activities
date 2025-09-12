package com.gl.jpa.controller;

import com.gl.jpa.service.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {

    private final ApiService apiService;

    public ItemController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/items")
    public String showItems(Model model) {
        model.addAttribute("categories", apiService.getCategories());
        model.addAttribute("items", apiService.getItems());
        return "items"; // items.jsp
    }
}
