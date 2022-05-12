package com.adrianopequeno.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianopequeno.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
