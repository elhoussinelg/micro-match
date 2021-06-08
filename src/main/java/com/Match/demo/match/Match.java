package com.Match.demo.match;

//import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;

//import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Match {

	public enum Type {
		amical ,
		Ligue ,
		Coupe
	}

	public enum Categorie {
		U6 ,
		U8,
		U10 ,
		U12
	}

	@Id 
	@GeneratedValue
	private Long id ;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	// private LocalTime time;
	private String lieu;
	private Type type;
	private Categorie categorie;
	private String adversary;

	public String getAdversary() {
		return adversary;
	}

	public void setAdversary(String adversary) {
		this.adversary = adversary;
	}

	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Match() {
		super();
	}


	public Match(LocalDate date, String lieu, Type type, Categorie categorie, String adversary) {
		super();
		//this.id = id;
		this.date = date;
		this.lieu = lieu;
		this.type = type;
		this.categorie = categorie ;
		this.adversary = adversary;
		
	}
	

	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	

	
	
}
