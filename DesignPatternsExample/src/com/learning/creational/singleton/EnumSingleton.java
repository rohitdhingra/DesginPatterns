package com.learning.creational.singleton;

public enum EnumSingleton {

	SINGLETON;
	
	int val;
	
	public static void doStuff()
	{
		System.out.println("This is ENUM singleton");
	}
}
