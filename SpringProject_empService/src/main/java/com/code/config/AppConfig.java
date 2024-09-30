package com.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.code.controller.EmployeeController;
import com.code.service.EmployeeService;

@Configuration
public class AppConfig {

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
	
	@Bean
	public EmployeeController employeeController() {
		return new EmployeeController(employeeService());
	}
}
