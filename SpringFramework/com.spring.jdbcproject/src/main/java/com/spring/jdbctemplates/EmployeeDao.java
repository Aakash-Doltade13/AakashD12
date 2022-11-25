package com.spring.jdbctemplates;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDao {

	// initialize database ie connection.
	public void setDataSource(DataSource ds);

	// create a record
	public void create(String name, String add);

	// get all the details
	public Employee getEmployee(int id);

	// list all the records
	public List<Employee> listEmployees();

//	// delete records from table
//	public void delete(int id);
//
//	// update the records
//	public void update(int id, String add);

}
