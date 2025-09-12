package com.gl.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.security.model.OrderItem;
import com.gl.security.service.OrderItemService;

@RestController
@RequestMapping("/order-items")
public class OrderItemController {
	
	@Autowired
	OrderItemService
	orderItemService;
	
	@PostMapping
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
		//System.out.println(orderItem.getOrder().getId());
        return orderItemService.saveOrderItem(orderItem);
    }

    @GetMapping("/order/{orderId}")
    public List<OrderItem> getItemsByOrderId(@PathVariable Long orderId) {
        return orderItemService.getItemsByOrderId(orderId);
    }

    @GetMapping("/{id}")
    public Optional<OrderItem> getOrderItemById(@PathVariable Long id) {
        return orderItemService.getOrderItemById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
        return "Order item deleted successfully";
    }
	

}
