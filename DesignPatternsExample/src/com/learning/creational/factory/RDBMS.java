package com.learning.creational.factory;

public class RDBMS implements Database {

	@Override
	public String connect() {
		return "Connection successful with RDBMS";
	}

}
