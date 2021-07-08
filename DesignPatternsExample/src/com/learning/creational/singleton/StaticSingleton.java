package com.learning.creational.singleton;

public class StaticSingleton {
	
	private static StaticSingleton singleton;
	
	private StaticSingleton()
	{
		
	}
	static {
		try {
			singleton = new StaticSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured while creating singleton instance");
		}
	}
	
	public static StaticSingleton getInstance()
	{
		return singleton;
	}

}
