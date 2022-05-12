package com.adrianopequeno.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianopequeno.curso.entities.Product;
import com.adrianopequeno.curso.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	// método que retorna todos os usuários do BD
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	// método que retorna o usuário por id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		
		return obj.get();
	}
}
