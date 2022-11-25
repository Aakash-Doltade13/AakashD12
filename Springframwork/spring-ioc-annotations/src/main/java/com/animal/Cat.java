package com.animal;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	public void doSound() {
		System.out.println("meow-meow");
		
	}

}
