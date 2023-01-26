package com.brenobss.webservicespringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenobss.webservicespringjpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
