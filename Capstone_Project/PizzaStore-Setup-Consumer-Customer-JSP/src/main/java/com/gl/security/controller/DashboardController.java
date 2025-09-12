package com.gl.security.controller;

import jakarta.servlet.http.HttpSession;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard(HttpSession session, Model model) {
        String username = (String) session.getAttribute("customerUsername");
        model.addAttribute("customer", Map.of("username", username));
        return "dashboard";
    }
}
