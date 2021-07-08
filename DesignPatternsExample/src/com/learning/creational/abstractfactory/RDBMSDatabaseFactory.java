package com.learning.creational.abstractfactory;

public class RDBMSDatabaseFactory extends DatabaseFactory {

	@Override
	public Database getDatabase(String dbType) {
		Database dc = null;
		if("Oracle".equals(dbType))
			dc = new Oracle();
		else if("MySql".equals(dbType))
			dc  = new MySql();
		else
			dc = new MySql();
		return dc;
	}

}
