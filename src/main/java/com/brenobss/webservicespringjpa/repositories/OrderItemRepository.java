package com.brenobss.webservicespringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenobss.webservicespringjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
