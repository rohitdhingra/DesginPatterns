package com.learning.creational.builder;

public class Manufacturer {

	public static Mobile createCompleteObject() {
		MobileBuilder mobBuilder = new MobileConcreteBuilder();
		return mobBuilder.buildMobile();  
	}

}
