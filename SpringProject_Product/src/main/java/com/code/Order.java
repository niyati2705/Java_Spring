package com.code;

import java.time.LocalDate;

public class Order {
	private int id;
	private String orderDate;

	public Order() {

	}

	public Order(int id, String orderDate) {
		super();
		this.id = id;
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

}
