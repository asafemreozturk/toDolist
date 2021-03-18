package com.example.toDolist;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.example.toDolist.controller","com.example.toDolist.service",
		"com.example.toDolist.repository"})
@SpringBootApplication
public class ToDolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDolistApplication.class, args);
	}
	

}


	
	









