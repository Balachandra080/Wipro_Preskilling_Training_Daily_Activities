package com.gl.security.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.security.model.OrderItem;
import com.gl.security.repo.OrderItemRepo;

@Service
public class OrderItemService {
	
	@Autowired
	OrderItemRepo orderItemRepo;
	
	public OrderItem saveOrderItem(OrderItem orderItem) {
        return orderItemRepo.save(orderItem);
    }

    public List<OrderItem> getItemsByOrderId(Long orderId) {
        return orderItemRepo.findByOrderId(orderId);
    }

    public Optional<OrderItem> getOrderItemById(Long id) {
        return orderItemRepo.findById(id);
    }

    public void deleteOrderItem(Long id) {
        orderItemRepo.deleteById(id);
    }

}
