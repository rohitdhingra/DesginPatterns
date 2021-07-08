package com.learning.creational.abstractfactory;

public class DBMSDatabaseFactory extends DatabaseFactory {

	@Override
	public Database getDatabase(String dbType) {
		Database dc = null;
		if("MsAccess".equals(dbType))
			dc = new MsAccess();
		else if("XML".equals(dbType))
			dc  = new XML();
		else if("MongoDB".equals(dbType))
			dc  = new MongoDB();
		else
			dc = new XML();
		return dc;
	}

}
