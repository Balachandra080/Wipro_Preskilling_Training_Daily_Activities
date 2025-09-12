package com.gl.jpa.controller;

import com.gl.jpa.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeliveryStatusController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/delivery")
    public String viewDeliveryStatus(Model model) {
        model.addAttribute("statuses", apiService.getDeliveryStatuses());
        return "deliveryStatus";  // ✅ forwards to deliveryStatus.jsp
    }
}
