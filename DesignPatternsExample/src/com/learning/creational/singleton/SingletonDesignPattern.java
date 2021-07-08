package com.learning.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDesignPattern {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EagerSingleton obj  = EagerSingleton.getInstance();
		saveToFile(obj,"myFile.bin");
		obj.setVal(20);
		EagerSingleton obj2 = readFromFile("myFile.bin");
		System.out.println(obj.getVal());
		System.out.println(obj2.getVal());
		
		Constructor cons = obj.getClass().getDeclaredConstructor(new Class[0]);
		cons.setAccessible(true);
		
		EagerSingleton obj3 = (EagerSingleton) cons.newInstance();
		System.out.println(obj3.getVal());
		
		if(obj==obj3)
		{
			System.out.println("both are same");
			
		}
		else
		{
			System.out.println("both are diff");
		}
		
		EnumSingleton eSing = EnumSingleton.SINGLETON;
		eSing.doStuff();
	}	

	private static EagerSingleton readFromFile(String name) throws IOException, ClassNotFoundException {
		try(FileInputStream fin = new FileInputStream(name);
				ObjectInputStream in = new ObjectInputStream(fin))
		{
			return (EagerSingleton) in.readObject();
		}
	}

	private static void saveToFile(EagerSingleton singleton, String name) throws IOException {
		try(FileOutputStream fout = new FileOutputStream(name);
				ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(singleton);
		}
	}
	
}
