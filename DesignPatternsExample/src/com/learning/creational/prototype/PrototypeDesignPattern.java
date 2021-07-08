package com.learning.creational.prototype;

public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		CoffeeShop cs = new CoffeeShop();
		cs.setShopName("CCD");
		cs.loadStock();
	
		
		CoffeeShop cs1 = (CoffeeShop) cs.clone();
		cs1.setShopName("CCD London");
//		cs1.loadStock();
		cs.getCoffeeTypes().remove(0);
		System.out.println(cs);
		System.out.println(cs1);
	}

}
