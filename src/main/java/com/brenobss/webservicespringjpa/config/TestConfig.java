package com.brenobss.webservicespringjpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.brenobss.webservicespringjpa.entities.Order;
import com.brenobss.webservicespringjpa.entities.User;
import com.brenobss.webservicespringjpa.repositories.OrderRepository;
import com.brenobss.webservicespringjpa.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User maria = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User alex = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), maria); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), alex); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), maria);
		
		userRepository.saveAll(Arrays.asList(maria, alex));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	

}
