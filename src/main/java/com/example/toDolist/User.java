package com.example.toDolist;



import java.time.LocalDate;
import java.*;
import javax.persistence.*;


import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
@Data
@Table(name = "user")
public class User  {
   

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long id;
	@Column(name="Content", nullable=false, length=512)
	protected String Content;
   
    @Enumerated(EnumType.ORDINAL)
    @Column(name="priority", nullable=false, length=512)
    protected int priority;
	protected LocalDate processDate; 
	
    
	
	
	public User(long id, String Content,LocalDate  processDate,int priority) {
	this.id=id;
	this.Content=Content;
	this.processDate=processDate;
	this.priority=priority;
	
    }
	
	
}	
	
           


























