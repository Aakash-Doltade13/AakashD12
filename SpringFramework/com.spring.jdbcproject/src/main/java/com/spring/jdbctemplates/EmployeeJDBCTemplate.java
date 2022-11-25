package com.spring.jdbctemplates;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDao 
{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public void create(String name, String add)
	{
		String SQL = "insert into employee (name, add) values (?, ?)";
		jdbcTemplateObject.update(SQL, name, add);
		System.out.println("Created Record Name = " + name + " Add = " + add);
		return;
	}

	public Employee getEmployee(int id) {
		String SQL = "select * from employee where id = ?";
		Employee employee = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new EmployeeMapper());

		return employee;
	}

	public List<Employee> listEmployees() {
		String SQL = "select * from employee";
		List<Employee> employees = jdbcTemplateObject.query(SQL, new EmployeeMapper());
		return employees;
	}

//	public void delete(int id) {
//		String SQL = "delete from employee where id = ?";
//		jdbcTemplateObject.update(SQL, id);
//		System.out.println("Deleted Record with ID = " + id);
//		return;
//	}
//
//	public void update(int id, String add) {
//		String SQL = "update employee set add = ? where id = ?";
//		jdbcTemplateObject.update(SQL, add , id);
//		System.out.println("Updated Record with ID = " + id);
//		return;
//	}

}
