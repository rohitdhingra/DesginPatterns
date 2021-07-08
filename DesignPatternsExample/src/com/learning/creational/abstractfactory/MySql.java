package com.learning.creational.abstractfactory;

public class MySql implements Database {

	@Override
	public String connect() {
		// TODO Auto-generated method stub
		return "Connection successful with MySQL";
	}

}
