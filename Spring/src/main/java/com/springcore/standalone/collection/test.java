package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String args []) {
	
	ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/configure.xml");
	person per=con.getBean("brothers" , person.class);
	System.out.println(per);
	
}
}
