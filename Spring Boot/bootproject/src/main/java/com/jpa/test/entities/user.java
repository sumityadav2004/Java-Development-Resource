package com.jpa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class user {

	@Id
	@GeneratedValue
	
   private	int id;
   private String name;
   private String city;
   private String Status;
   
   public user(int id, String name, String city, String status) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		Status = status;
   }
   
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public String getCity() {
	return city;
   }
  

   public void setCity(String city) {
	this.city = city;
   }
   public String getStatus() {
	return Status;
   }
   public void setStatus(String status) {
	Status = status;
   }
   public user() {
	super();
	// TODO Auto-generated constructor stub
   }
   @Override
   public String toString() {
	return "user [id=" + id + ", name=" + name + ", city=" + city + ", Status=" + Status + "]";
   }
   
	
}
