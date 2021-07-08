package com.learning.behavioural.visitor;

public class Employee implements Visitable {

	private String name;
	
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String performanceStatus;

	public String getPerformanceStatus() {
		return performanceStatus;
	}

	public void setPerformanceStatus(String performanceStatus) {
		this.performanceStatus = performanceStatus;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
}
