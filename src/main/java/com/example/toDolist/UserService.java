package com.example.toDolist;

import com.example.toDolist.UserRepository;

import models.User;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
     @Autowired
	 private UserRepository userRepository;
	 public List<User> listAllUser(){
		 return userRepository.findAll().orElse()->;
	 }
	 
	 public void saveUser(User user) {
		 userRepository.save(user);
	 }
	 
	 public User getUser(Integer id) {
		 return userRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Task not found"));
	 }
	 
	 public void deleteUser(Integer id) {
		 userRepository.deleteById(id);	 
	 }
	
}
