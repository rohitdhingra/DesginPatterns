package com.learning.creational.factory;

public class DatabaseFactory {
	public static Database getDatabase(String dbType) {
		Database dc = null;
		if ("RDBMS".equals(dbType)) {
			dc = new RDBMS();
		} else
			dc = new DBMS();

		return dc;
	}
}
