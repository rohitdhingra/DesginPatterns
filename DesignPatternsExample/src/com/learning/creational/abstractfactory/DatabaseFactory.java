package com.learning.creational.abstractfactory;

public abstract class DatabaseFactory {
	
	public abstract Database getDatabase(String type);
	
	public static DatabaseFactory createDatabaseFactory(String factoryType) {
		DatabaseFactory dc = null;
		if ("RDBMS".equals(factoryType)) {
			dc = new RDBMSDatabaseFactory();
		} else
			dc = new DBMSDatabaseFactory();

		return dc;
	}
}
