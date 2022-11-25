package com.bike;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Bike {
	
	@Value (value ="102030")
	int id ;
	
	@Value (value ="180")
	int cc;
	
	@Value (value ="abc")
	String name;
	
	@Value (value ="black")
	String colour;
	
	public void Details ()
	{
		System.out.println("Book ID : "+id);
		System.out.println("Bike Engine : "+cc+" cc");
		System.out.println("Bike name : "+name);
		System.out.println("Bike Colour : "+colour);
	}

}
