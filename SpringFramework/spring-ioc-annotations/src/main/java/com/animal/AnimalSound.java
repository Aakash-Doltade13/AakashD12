package com.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {

	private Animal animal;

	public void Sound() {
		animal.doSound();
	}

	@Autowired
	@Qualifier(value = "cow")
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
