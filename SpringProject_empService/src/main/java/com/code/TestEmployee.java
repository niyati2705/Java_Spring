package com.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.code.config.AppConfig;
import com.code.controller.EmployeeController;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeController controller = context.getBean(EmployeeController.class);
		
		System.out.println("All Employees:");
		controller.printAllEmployees();
		
		System.out.println("Employee with ID: ");
		controller.printEmployeeById(100);
		
		
	}
}
