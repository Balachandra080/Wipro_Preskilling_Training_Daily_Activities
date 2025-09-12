package com.gl.security.controller;

import com.gl.security.client.OrderClient;
import com.gl.security.dto.OrderDto;
import com.gl.security.model.DeliveryStatus;
import com.gl.security.service.DeliveryStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/delivery")
public class DeliveryStatusController {

    @Autowired
    private DeliveryStatusService service;

    @Autowired
    private OrderClient orderClient;

    @PostMapping("/add")
    public ResponseEntity<DeliveryStatus> addStatus(
            @RequestParam Long orderId,
            @RequestParam String status) {

        // verify order exists from Order microservice
        OrderDto order = orderClient.getOrderById(orderId);
        if (order == null) {
            return ResponseEntity.badRequest().build();
        }

        DeliveryStatus ds = new DeliveryStatus(orderId, status, LocalDateTime.now());
        return ResponseEntity.ok(service.saveDeliveryStatus(ds));
    }

    @GetMapping("/all")
    public ResponseEntity<List<DeliveryStatus>> getAllStatuses() {
        return ResponseEntity.ok(service.getAllStatuses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeliveryStatus> getStatus(@PathVariable Long id) {
        DeliveryStatus status = service.getStatusById(id);
        if (status != null) {
            return ResponseEntity.ok(status);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<String> getOrderWithStatus(@PathVariable Long orderId) {
        OrderDto order = orderClient.getOrderById(orderId);
        DeliveryStatus status = service.getAllStatuses()
                .stream()
                .filter(ds -> ds.getOrderId().equals(orderId))
                .findFirst()
                .orElse(null);

        if (order == null || status == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Order placed on " + order.getOrderDateTime() +
                " by user " + order.getUserId() +
                " has status: " + status.getStatus());
    }
}
