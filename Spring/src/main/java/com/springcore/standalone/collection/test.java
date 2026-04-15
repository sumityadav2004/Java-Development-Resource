package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
public static void main(String args []) {
	
	ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/configure.xml");
	person per=con.getBean("person1" , person.class);
	System.out.println(per);
	
	System.out.println( per.getBrothers().getClass().getName());
	System.out.println("______________________________");
	System.out.println(per.getFeestructure());
	System.out.println("______________________________");
	System.out.println(per.getProperties());
	
}
}
