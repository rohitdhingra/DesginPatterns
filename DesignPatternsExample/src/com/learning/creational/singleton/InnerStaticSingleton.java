package com.learning.creational.singleton;

public class InnerStaticSingleton {

	private InnerStaticSingleton() {}
	
	
	private static class Singleton
	{
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}

	public InnerStaticSingleton getInstance()
	{
		return Singleton.INSTANCE;
	}
}

