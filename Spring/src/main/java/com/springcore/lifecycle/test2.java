 package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
																																																																																																																																																																																																																								
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class test2 {

	public static void main(String[] args){
	
  AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	first f1=(first) context.getBean("f1");
	System.out.println("f1");
	context.registerShutdownHook();
	
	System.out.println("++++++++++++++++");
	second s1=(second) context.getBean("s1");
	System.out.println(s1);
	
	third three=(third) context.getBean("three");
	System.out.println(three);
	}

}
 