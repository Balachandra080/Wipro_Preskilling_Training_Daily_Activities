package com.gl.security.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.security.model.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Long>{
	List<OrderItem> findByOrderId(Long orderId);

}
