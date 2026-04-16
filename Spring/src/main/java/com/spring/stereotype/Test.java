package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/stereotype/Stereoconfigure.xml"); 
		Student student=con.getBean("obj",Student.class);
		//System.out.println(student);
		//System.out.println(student.getName());
		//System.out.println(student.getName().getClass().getName());
		System.out.println(student.hashCode());
		
		Student student2=con.getBean("obj",Student.class);
		System.out.println(student2.hashCode());
		
		
	       teacher t1=con.getBean("teac",teacher.class);
	       System.out.println(t1.hashCode());
	       teacher t2=con.getBean("teac",teacher.class);
	       System.out.println(t2.hashCode());
		
	}

}
