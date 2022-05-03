package com.adrianopequeno.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adrianopequeno.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
