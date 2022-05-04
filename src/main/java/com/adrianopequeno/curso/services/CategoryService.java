package com.adrianopequeno.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianopequeno.curso.entities.Category;
import com.adrianopequeno.curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	// método que retorna todas as categorias do BD
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	// método que retorna categoria por id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		
		return obj.get();
	}
}
