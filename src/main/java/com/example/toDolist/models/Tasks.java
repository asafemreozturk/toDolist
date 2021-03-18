package com.example.toDolist.models;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected int id;

    @Column(name="content", nullable=false, length=512)
    protected String Content;

    public Tasks() {

    }

    enum priority{
        First , Second, Third;
    }



    @Column(name="Priority", nullable=false, length=512)
    protected String priority;
    protected LocalDate processDate;



    public Tasks(int id, String Content, LocalDate processDate,String priority) {
        this.id=id;
        this.Content=Content;
        this.processDate=processDate;
        this.priority=priority;

    }

    public void setId(Integer id) {
        this.id=id;
    }













}
