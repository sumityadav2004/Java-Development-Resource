package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractionApplicationContext;


public class test2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
  AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	first f1=(first) context.getBean("f1");
	System.out.println("f1");
	context.registerShutdonHooks();
	}

}
