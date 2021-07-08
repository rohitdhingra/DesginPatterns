package com.learning.structural.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Product {

	private final String name;

	public Product(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
	
}
class Order
{
	private final int orderNumber;
	private final Product product;
	public Order(int orderNumber, Product product) {
		super();
		this.orderNumber = orderNumber;
		this.product = product;
	}
	
	
	public void processOrder()
	{
		System.out.println("Ordering "+ product+ " for order number "+orderNumber);
	}
	
}

class Portfolio
{
	private Map<String,Product> products = new HashMap<>();
	
	public Product lookup(String productName)
	{
		if(!products.containsKey(productName))
			products.put(productName, new Product(productName));
			
		return products.get(productName);
	}
	
	public int totalProductsMade()
	{
		return products.size();
	}
}

class Bucket{
	private  final Portfolio portfolio = new Portfolio();
	private final List<Order> orders = new CopyOnWriteArrayList<>();
	public void executeOrder(String productName,int orderNumber)
	{
		Product product = portfolio.lookup(productName);
		Order order = new Order(orderNumber,product);
		orders.add(order);
	}
	public void process()
	{
		for(Order order: orders)
		{
			order.processOrder();
			orders.remove(order);
		}
	}
	
	public int getTotalProducts()
	{
		return portfolio.totalProductsMade();
	}
	
	
	
}
