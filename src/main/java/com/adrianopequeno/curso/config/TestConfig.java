package com.adrianopequeno.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.adrianopequeno.curso.entities.User;
import com.adrianopequeno.curso.repositories.UserRepository;

@Configuration
@Profile("test") // igual ao nome que esta no profiles do arquivo application.properties
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	// Tudo que colocar dentro desse método sera executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria", "maria@gmail.com", "123456");
		User u2 = new User(null, "Paulo", "paulo@gmail.com", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
