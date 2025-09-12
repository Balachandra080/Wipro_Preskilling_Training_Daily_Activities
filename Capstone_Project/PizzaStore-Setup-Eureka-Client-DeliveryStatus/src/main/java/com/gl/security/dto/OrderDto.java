package com.gl.security.dto;

import java.time.LocalDateTime;

public class OrderDto {
    private Long id;
    private LocalDateTime orderDateTime;
    private Long userId;

    public OrderDto() {}

    public OrderDto(Long id, LocalDateTime orderDateTime, Long userId) {
        this.id = id;
        this.orderDateTime = orderDateTime;
        this.userId = userId;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getOrderDateTime() { return orderDateTime; }
    public void setOrderDateTime(LocalDateTime orderDateTime) { this.orderDateTime = orderDateTime; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
