package com.brenobss.webservicespringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenobss.webservicespringjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
