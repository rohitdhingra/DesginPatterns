package com.learning.creational.factory;

public class DBMS implements Database {

	@Override
	public String connect() {
		return "Connection successful with DBMS";
	}

}
