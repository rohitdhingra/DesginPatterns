package com.learning.creational.abstractfactory;

public class RDBMS implements Database {

	@Override
	public String connect() {
		return "Connection successful with RDBMS";
	}

}
