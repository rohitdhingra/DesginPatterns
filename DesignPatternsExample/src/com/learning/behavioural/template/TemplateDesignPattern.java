package com.learning.behavioural.template;

public class TemplateDesignPattern {
	public static void main(String[] args) {
		ProcessOrder shopVisit = new Shop();
		shopVisit.doShopping();
		
		ProcessOrder onlineShopping = new Flipkart();
		onlineShopping.doShopping();
	}
}
