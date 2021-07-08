package com.learning.creational.builder;

public class MobileConcreteBuilder extends MobileBuilder{

	@Override
	public void createMemory() {
		getMobile().setMemory("64GB");
		System.out.println("Memory created and installed");
		
	}

	@Override
	public void createBattery() {
		getMobile().setBattery("5000mAh");
		System.out.println("Battery created and installed");		
	}

	@Override
	public void createWireless() {
		getMobile().setWireless("Bluetooth and Wireless");
		System.out.println("created wireless features and installed");		
	}

	@Override
	public void createScreen() {
		getMobile().setScreen("Amoled");
		System.out.println("Screen created and installed");		
	}

	@Override
	public void createMetalCase() {
		getMobile().setMetalCase("Aluminum");
		System.out.println("Metal Case created and installed");		
	}

}
