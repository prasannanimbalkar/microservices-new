package com.prasannanimbalkar.orderservice.repository;


import com.prasannanimbalkar.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}