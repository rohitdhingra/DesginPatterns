package com.learning.creational.singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable{

	private static final EagerSingleton singleton = new EagerSingleton();
	
	private int val;
	
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	private EagerSingleton()
	{
		System.out.println("Singleton Created");
		val =10;
	}
	
	public static EagerSingleton getInstance()
	{
		return singleton;
	}
	
	protected Object readResolve()
	{
		return singleton;

	}
}
