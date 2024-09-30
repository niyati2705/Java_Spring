package com.code;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	private int id;
	private String name;

	public Employee() {

	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Spring bean is used to using "+"annotation");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Spring Destroyed");
	}
	
//	public void init() {
//		System.out.println("Spring bean ready to use");
//	} 
//	
//	public void destroy() {
//		System.out.println("Spring destroyed");
//	}

}
