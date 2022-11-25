package com.bike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	int id;
	String name;
	String gender;
	int age;
	private Bike bike;
	public Bike getBike() {
		return bike;
	}

     @Autowired public void setBike(Bike bike) {
		this.bike = bike;
	}

	public Student(@Value (value ="12345")int id, @Value (value ="abc")String name, @Value (value ="male")String gender, @Value (value ="24")int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public void Details()
	{
		System.out.println("Student Id : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Gender : "+gender);
		System.out.println("Student Age : "+age);
	}

}
