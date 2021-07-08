package com.learning.creational.abstractfactory;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.ResourceBundle;

public class AbstractFactoryDesignPattern {
	public static void main(String[] args) {
		DatabaseFactory factory = null;
		Database db = null;
		factory = DatabaseFactory.createDatabaseFactory("RDBMS");
		db = factory.getDatabase("MySql");
		System.out.println("Factory:"+factory.getClass().getSimpleName());
		System.out.println(db.connect());
		
		db = factory.getDatabase("Oracle");
		System.out.println("Database:"+db.getClass().getSimpleName());
		System.out.println(db.connect());
		
		factory = DatabaseFactory.createDatabaseFactory("DBMS");
		db = factory.getDatabase("MsAccess");
		System.out.println("Factory:"+factory.getClass().getSimpleName());
		System.out.println(db.connect());
		
		Calendar.getInstance();
		Arrays.asList("1","2");
		ResourceBundle.getBundle("abc");
		NumberFormat.getInstance();
	}
}
