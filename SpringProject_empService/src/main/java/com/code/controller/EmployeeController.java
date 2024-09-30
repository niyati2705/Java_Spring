package com.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.code.Employee;
import com.code.service.EmployeeService;

@Component
public class EmployeeController {

	private final EmployeeService empService;
	
	@Autowired
	public EmployeeController(EmployeeService empService) {
		this.empService = empService;
	}
	public void printAllEmployees()
	{
		List<Employee> employees = empService.getAllEmployees();
		employees.forEach(System.out::println);
	}
	
	
	public void printEmployeeById(int id) {
	    Employee employee = empService.getEmployeeById(id);
	    
	    if (employee != null) {
	        System.out.println("Employee ID: " + employee.getId());
	        System.out.println(employee);
	    } else {
	        System.out.println("Employee not found");
	    }
	}
}
