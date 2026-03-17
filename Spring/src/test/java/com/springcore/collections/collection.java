package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/Springcore/collections/cconfig.xml"); 
        emp employ1= (emp) context.getBean("employ1");
        System.out.println(employ1.getName());
        System.out.println(employ1.getPhones());
        System.out.println(employ1.getAddresses());
        System.out.println(employ1.getCourses());
        
	}

}
