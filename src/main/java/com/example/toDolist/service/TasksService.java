package com.example.toDolist.service;


import com.example.toDolist.models.Tasks;
import com.example.toDolist.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TasksService {
    @Autowired
    private TasksRepository tasksRepository;
    public List<Tasks> listAllTasks(){
        int[] emptyArray=new int[10];
        return tasksRepository.findAll(); //orElse(this.emptyArray);
    }

    public void saveTask(Tasks task) {
        tasksRepository.save(task);
    }

    public Tasks getTask(Integer id) {
        return tasksRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Task not found"));
    }

    public void deleteTask(Integer id) {
        tasksRepository.deleteById(id);
    }





}
