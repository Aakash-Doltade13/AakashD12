package com.spring.jdbctemplates;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDetails {

	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("employeebeans.xml");

	      EmployeeJDBCTemplate employeeJDBCTemplate = 
	         (EmployeeJDBCTemplate)context.getBean("employee");
	      
	      //REcord Creation
	      employeeJDBCTemplate.create("ABC", "Jp");
	      employeeJDBCTemplate.create("Suresh", "Up");
	      employeeJDBCTemplate.create("Dinesh", "Mp");

	      //Show All Details
	      List<Employee> employee = employeeJDBCTemplate.listEmployees();
	      
	      for (Employee record : employee) {
	         System.out.print("ID : " + record.getId() );
	         System.out.print(", Name : " + record.getName() );
	         System.out.println(", Age : " + record.getAdd());
	      }

	      //Update Record
//	      employeeJDBCTemplate.update(2, "Mahesh");
//
//	      //Show Details By Id
//	      Employee employee1 = employeeJDBCTemplate.getEmployee(2);
//	      System.out.print("ID : " + employee1.getId() );
//	      System.out.print(", Name : " + employee1.getName() );
//	      System.out.println(", Age : " + employee1.getAdd());
	   }
}
