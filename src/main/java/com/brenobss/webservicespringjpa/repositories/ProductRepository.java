package com.brenobss.webservicespringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenobss.webservicespringjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
