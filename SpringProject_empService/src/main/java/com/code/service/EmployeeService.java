package com.code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.code.Employee;

@Service
public class EmployeeService {

	private final List<Employee> employees = new ArrayList<>();
	
	public EmployeeService() {
		employees.add(new Employee(100,"Alex"));
		employees.add(new Employee(101,"Sam"));
		
	}
	
	public List<Employee> getAllEmployees(){
		return employees;
	}
	
	public Employee getEmployeeById(int id) {
		for(Employee employee: employees) {
			if(id==employee.getId()) {
				System.out.println("Employee"+ employee);
			}
		}
		return null;
	}
	
	
	
	
	
	
}
