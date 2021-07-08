package com.learning.creational.singleton;

public class LazyAndSyncSingleton {
	private static LazyAndSyncSingleton singleton;
	
	private LazyAndSyncSingleton() {}
	
	public static synchronized LazyAndSyncSingleton getInstance()
	{
		if(singleton== null)
		{
			return singleton = new LazyAndSyncSingleton();
		}
		return singleton;
	}
}
