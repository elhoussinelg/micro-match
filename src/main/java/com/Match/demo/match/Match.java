package com.Match.demo.match;

//import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Match {
	@Id 
	@GeneratedValue
	//@DateTimeFormat(pattern = "MM/dd/yyyy")	
	
	//private Date date; 
	private Long id ;
	private String lieu;
	private String type;
	
	
	
	public Match() {
		super();
	}


	public Match(Long id, String lieu, String type) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.type = type;
		//this.date = date;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
