package com.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Application-context.xml");
		
		Product product = (Product) context.getBean("prodbean", Product.class);
		
		Order order = (Order) context.getBean("order", Order.class);
		
		System.out.println(product.getId()+ product.getName() + product.getPrice()+
				" Order id->"+product.getOrder().getId()+" OrderDate ->" +product.getOrder().getOrderDate());
	}

}
