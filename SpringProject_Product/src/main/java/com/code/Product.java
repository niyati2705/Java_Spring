package com.code;

public class Product {
	private int id;
	private String name;
	private double price;
	Order order;

	public Product() {

	}

	

	public Product(int id, String name, double price, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.order = order;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	public Order getOrder() {
		return order;
	}



	public void setOrder(Order order) {
		this.order = order;
	}

	

}
