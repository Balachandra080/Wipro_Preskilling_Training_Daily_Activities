package com.gl.jpa.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(HttpSession session) {
        // Check if token is available (user logged in)
        if (session.getAttribute("token") == null) {
            return "redirect:/auth/login"; // if not logged in, go back to login
        }
        return "dashboard"; // JSP file name
    }
}
