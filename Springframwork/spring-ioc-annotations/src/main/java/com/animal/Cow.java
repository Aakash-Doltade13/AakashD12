package com.animal;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal {

	public void doSound() {
		System.out.println("mmmhhhhhh");
		
		
	}

}
