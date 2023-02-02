package com.brenobss.webservicespringjpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.brenobss.webservicespringjpa.entities.Category;
import com.brenobss.webservicespringjpa.entities.Order;
import com.brenobss.webservicespringjpa.entities.Product;
import com.brenobss.webservicespringjpa.entities.User;
import com.brenobss.webservicespringjpa.entities.enums.OrderStatus;
import com.brenobss.webservicespringjpa.repositories.CategoryRepository;
import com.brenobss.webservicespringjpa.repositories.OrderRepository;
import com.brenobss.webservicespringjpa.repositories.ProductRepository;
import com.brenobss.webservicespringjpa.repositories.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category eletronicsCategory = new Category(null, "Electronics"); 
		Category booksCategory = new Category(null, "Books"); 
		Category computersCategory = new Category(null, "Computers");
		
		Product product1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product product3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product product4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product product5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));
		categoryRepository.saveAll(Arrays.asList(eletronicsCategory, booksCategory, computersCategory));
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User alex = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, maria); 
		Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, alex); 
		Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, maria);
		
		userRepository.saveAll(Arrays.asList(maria, alex));
		
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		
	}
	

}
