package com.adrianopequeno.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.adrianopequeno.curso.entities.Category;
import com.adrianopequeno.curso.entities.Order;
import com.adrianopequeno.curso.entities.Product;
import com.adrianopequeno.curso.entities.User;
import com.adrianopequeno.curso.entities.enums.OrderStatus;
import com.adrianopequeno.curso.repositories.CategoryRepository;
import com.adrianopequeno.curso.repositories.OrderRepository;
import com.adrianopequeno.curso.repositories.ProductRepository;
import com.adrianopequeno.curso.repositories.UserRepository;

@Configuration
@Profile("test") // igual ao nome que esta no profiles do arquivo application.properties
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	// Tudo que colocar dentro desse método sera executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, conserctetur", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Lorem ipsum dolor sit amet, conserctetur", 2190.0, "");
		Product p3 = new Product(null, "Mouse Gamer", "Lorem ipsum dolor sit amet, conserctetur", 220.0, "");
		Product p4 = new Product(null, "Keyboards", "Keyghron k2", 600.5, "");
		Product p5 = new Product(null, "Rails for Dummies", "Lorem ipsum dolor sit amet, conserctetur", 100.5, "");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		User u1 = new User(null, "Maria", "maria@gmail.com", "123456");
		User u2 = new User(null, "Paulo", "paulo@gmail.com", "123456");
		
		Order o1 = new Order(null, Instant.parse("2022-04-29T08:45:00Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-03-29T08:45:00Z"), OrderStatus.DELIVERED, u2);
		Order o3 = new Order(null, Instant.parse("2022-02-26T08:45:00Z"), OrderStatus.SHIPPED, u1);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}
	
	
}
