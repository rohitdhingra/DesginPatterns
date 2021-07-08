package com.learning.behavioural.template;

public class Flipkart extends ProcessOrder {

	@Override
	public void selectProduct() {
		System.out.println("---Online Shopping----");
		System.out.println("Search for the relative product");
		System.out.println("Add to cart");
		System.out.println("Checkout");
	}

	@Override
	public void makePayment() {
		System.out.println("Add Address Details..");
		System.out.println("select mode of payment");
		System.out.println("Make Payment");
	}

	@Override
	public void deliver() {
		System.out.println("Your product will be delivered in 3-4 working days");
		System.out.println("Continue SHopping.");
		System.out.println("-----------------------------------");
	}

}
