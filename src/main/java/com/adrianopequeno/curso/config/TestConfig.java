package com.adrianopequeno.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.adrianopequeno.curso.entities.Order;
import com.adrianopequeno.curso.entities.User;
import com.adrianopequeno.curso.repositories.OrderRepository;
import com.adrianopequeno.curso.repositories.UserRepository;

@Configuration
@Profile("test") // igual ao nome que esta no profiles do arquivo application.properties
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	// Tudo que colocar dentro desse método sera executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria", "maria@gmail.com", "123456");
		User u2 = new User(null, "Paulo", "paulo@gmail.com", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-04-29T08:45:00Z"), u1);
		Order o2 = new Order(null, Instant.parse("2022-03-29T08:45:00Z"), u2);
		Order o3 = new Order(null, Instant.parse("2022-02-26T08:45:00Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}
	
	
}
