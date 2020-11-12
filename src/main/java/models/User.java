package models;



import java.time.LocalDate;
import java.*;
import javax.persistence.*;


import lombok.Data;





@Entity
@Data
@Table(name = "Tasks")
public class User  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	
	@Column(name="content", nullable=false, length=512)
	protected String Content;
   
    @Enumerated(EnumType.ORDINAL)
    @Column(name="Priority", nullable=false, length=512)
    protected int priority;
	protected LocalDate processDate; 
	
   
	
	public User(int id, String Content,LocalDate  processDate,int priority) {
	this.id=id;
	this.Content=Content;
	this.processDate=processDate;
	this.priority=priority;
	
    }

	public void setId(Integer id) {
		
		this.id=id;
	}

	
}	
	
           


























