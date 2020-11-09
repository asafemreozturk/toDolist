package com.example.toDolist;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.*;
import javax.persistence.*;


/*public enum priority{
	First , Second, Third;
}*/

 

@Entity
public class User  {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected long id;
    @Column(name="Content", nullable=true, length=512)
	protected String Content;
    Date date = new Date(id);
    
    @Enumerated(EnumType.ORDINAL)
    protected int priority;
	protected LocalDate processDate; 
	

   public User() {
	   
   }
	
	
	public User(long id, String Content,LocalDate  processDate,int priority) {
	this.id=id;
	this.Content=Content;
	this.processDate=processDate;
	this.priority=priority;
	
    }
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
    public String getContent() {
    	return Content;
    }
	public void setContent(String Content) {
		this.Content=Content;
	}
	public LocalDate getprocessDate() {
		return processDate;
	}
	public void setprocessDate(LocalDate processDate) {
		this.processDate=processDate;
	}
	public int getpriority() {
		return priority;
	}
	public void setpriority() {
		this.priority=priority;
	}
	
}	
	
           


























