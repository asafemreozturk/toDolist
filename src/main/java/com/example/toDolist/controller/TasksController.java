package com.example.toDolist.controller;


import com.example.toDolist.models.Tasks;
import com.example.toDolist.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/tasks")

public class TasksController {
    @Autowired
    TasksService tasksService;


    @GetMapping("")
    public List<Tasks> list(){
        return tasksService.listAllTasks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tasks> get(@PathVariable Integer id) throws EntityNotFoundException {
       Tasks task = tasksService.getTask(id);
        return new ResponseEntity<Tasks>(task, HttpStatus.OK);

    }

    @PostMapping
    public void add(@RequestBody Tasks task) {
        tasksService.saveTask(task);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Tasks task,
                                    @PathVariable Integer id) throws EntityNotFoundException {
        Tasks existTask = tasksService.getTask(id);
        task.setId(id);
        tasksService.saveTask(task);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        tasksService.deleteTask(id);
    }







}
