package com.brenobss.webservicespringjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brenobss.webservicespringjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
