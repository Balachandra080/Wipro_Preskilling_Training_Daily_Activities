package com.gl.security.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class ApiService {

    private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // ===== AUTH =====
    public String registerUser(Map<String, Object> user) {
        return restTemplate.postForObject("http://user-service/auth/register", user, String.class);
    }

    public String loginUser(Map<String, Object> loginData) {
        return restTemplate.postForObject("http://user-service/auth/login", loginData, String.class);
    }

    // ===== CATEGORY =====
    public List<?> listCategories() {
        return restTemplate.getForObject("http://category-service/categories", List.class);
    }

    // ===== ITEM =====
    public List<?> listItems() {
        return restTemplate.getForObject("http://item-service/items", List.class);
    }

    // ===== ORDER =====
    public String placeOrder(Map<String, Object> orderData) {
        return restTemplate.postForObject("http://order-service/orders", orderData, String.class);
    }

    // Get all orders for a customer
    public List<?> listOrders(Long customerId) {
        if (customerId == null) {
            // fallback or get all orders (for demo purposes)
            return restTemplate.getForObject("http://order-service/orders", List.class);
        }
        return restTemplate.getForObject("http://order-service/orders/customer/" + customerId, List.class);
    }

    // ===== DELIVERY STATUS =====
    public List<?> listDeliveryStatus(Long orderId) {
        return restTemplate.getForObject("http://delivery-status-service/delivery-status/order/" + orderId, List.class);
    }
}
