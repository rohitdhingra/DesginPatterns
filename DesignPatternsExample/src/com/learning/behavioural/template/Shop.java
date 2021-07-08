package com.learning.behavioural.template;

public class Shop extends ProcessOrder {

	@Override
	public void selectProduct() {
		System.out.println("---Offline Shopping----");
		System.out.println("Go to the appropriate rack and choose the product");
		}

	@Override
	public void makePayment() {
		System.out.println("Go the cash counter");
		System.out.println("stand in a queue");
		System.out.println("Make Payment");
		System.out.println("Get the PAID stamped copy of bill");
	}

	@Override
	public void deliver() {
		System.out.println("SHow th copy of your bill and take the things");
		System.out.println("-----------------------------------");
	}

}
