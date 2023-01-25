package com.brenobss.webservicespringjpa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.brenobss.webservicespringjpa.entities.User;
import com.brenobss.webservicespringjpa.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		User maria = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User alex = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		repo.saveAll(Arrays.asList(maria, alex));
		
	}
	

}
