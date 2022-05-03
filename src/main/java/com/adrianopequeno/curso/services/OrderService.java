package com.adrianopequeno.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianopequeno.curso.entities.Order;
import com.adrianopequeno.curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	// método que retorna todos os pedidos do BD
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	// método que retorna o pedido por id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}
}
