package car.injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import car.driver.Car;

public class CarDriver {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("car.xml");
		
		Car car =(Car) applicationContext.getBean("car1");
		car.Details();
	
	}
	
	

}
