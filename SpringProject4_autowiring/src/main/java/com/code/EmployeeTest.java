package com.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Application-context.xml");
		Employee employee = (Employee) context.getBean("empbean", Employee.class);
		
		Address address = (Address) context.getBean("address", Address.class);
		System.out.println(employee.getId()+ employee.getName() + employee.getAddress().getCity());
		
	}

}
