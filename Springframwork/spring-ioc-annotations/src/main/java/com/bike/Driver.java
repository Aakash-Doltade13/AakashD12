package com.bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
	ApplicationContext applicationcontext =new ClassPathXmlApplicationContext("springconfiguration.xml");
		Bike bike = (Bike) applicationcontext.getBean("bike");
		bike.Details();
		
		Student student =(Student) applicationcontext.getBean("student");
		student.Details();
		
	 
	}

}
