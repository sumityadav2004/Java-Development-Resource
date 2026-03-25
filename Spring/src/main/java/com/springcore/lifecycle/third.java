package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class third {
 private String course;

 public third() {
	super();
	// TODO Auto-generated constructor stub
}

 public String getCourse() {
	return course;
 }

 public void setCourse(String course) {
	this.course = course;
 }

 @Override
 public String toString() {
	return "third [course=" + course + "]";
 }
 @PostConstruct
 public void start() {
	 System.out.println("Starting initialization");
 }
 @PreDestroy
 public void end() {
	 System.out.println("Destroy the method");
 }
 
}
