package com.adrianopequeno.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adrianopequeno.curso.entities.User;
import com.adrianopequeno.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	// método que retorna todos os usuários do BD
	public List<User> findAll() {
		return repository.findAll();
	}
	
	// método que retorna o usuário por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
	}
}
