package com.gl.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.security.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
