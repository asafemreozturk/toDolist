package com.example.toDolist.repository;


import com.example.toDolist.models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TasksRepository extends JpaRepository<Tasks, Integer> {

    Optional<Tasks> findById(int id);
    // List<User> findAll();


}
