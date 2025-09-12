package com.gl.security.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.security.model.DeliveryStatus;

public interface DeliveryStatusRepo extends JpaRepository<DeliveryStatus, Long>{
	List<DeliveryStatus> findByOrderId(Long orderId);

}
