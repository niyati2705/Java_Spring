package com.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Application-context.xml");

		Employee employee1 = context.getBean("empbean", Employee.class);		
		employee1.show();
		System.out.println(employee1);
		
		Employee employee2 = context.getBean("empbean", Employee.class);
		employee2.show();
		System.out.println(employee2);
	}

}
