package com.animal;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal 
{

	public void doSound() {
         System.out.println("bhow-bhow");
		
	}
   
}
