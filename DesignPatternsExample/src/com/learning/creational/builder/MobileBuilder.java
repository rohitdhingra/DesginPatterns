package com.learning.creational.builder;

public abstract class MobileBuilder {

	Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	public abstract void createMemory();
	public abstract void createBattery();
	public abstract void createWireless();	
	public abstract void createScreen();
	public abstract void createMetalCase();
	
	public final Mobile buildMobile()
	{
		Mobile mobile = new Mobile();
		setMobile(mobile);
		
		createMemory();
		createBattery();
		createWireless();
		createScreen();
		createMetalCase();
		
		return mobile;
	}
	
}
