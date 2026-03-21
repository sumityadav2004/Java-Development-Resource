package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfigure.xml");
        person p=(person)context.getBean("person");
        System.out.println(p);
        
        Addition addition=(Addition)context.getBean("addition");
        addition.dosum();
	}

}
