package com.gl.jpa.controller;

import com.gl.jpa.service.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class OrderUIController {

    private final ApiService apiService;

    public OrderUIController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/orders")
    public String showOrders(Model model) {
        List<Map<String, Object>> orders = apiService.getOrders();
        model.addAttribute("orders", orders);
        return "orders";  // orders.jsp
    }
}
