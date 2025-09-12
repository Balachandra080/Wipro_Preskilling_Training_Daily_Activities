package com.gl.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.gl.security.service.ApiService;

@Controller
@RequestMapping("/items")
public class ItemController {

    private final ApiService apiService;

    public ItemController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping
    public String listItems(Model model) {
        model.addAttribute("items", apiService.listItems());
        return "browseItems";
    }
}
