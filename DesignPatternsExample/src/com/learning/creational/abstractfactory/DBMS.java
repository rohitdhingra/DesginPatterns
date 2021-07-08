package com.learning.creational.abstractfactory;

public class DBMS implements Database {

	@Override
	public String connect() {
		return "Connection successful with DBMS";
	}

}
