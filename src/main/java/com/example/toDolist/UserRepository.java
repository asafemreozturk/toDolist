package com.example.toDolist;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



import models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findById(int id);  
    Optional<User> findAll();
	
}
