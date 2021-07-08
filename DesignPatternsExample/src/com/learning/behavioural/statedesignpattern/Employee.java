package com.learning.behavioural.statedesignpattern;

public class Employee {
	private String designation;
	public String getDesignation() {
		return designation;
	}

	
	EmployeeState empState;
	public Employee(String designation) {
		setDesignation(designation);
	}
	
	public void working()
	{
		empState.work();
	}
	public void authorities()
	{
		empState.canApproveLeave();
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
		if(designation.equals("HR"))
		{
			empState = new HR();
		}
		else if(designation.equals("Developer"))
		{
			empState = new Developer();
		}		
		else if(designation.equals("Manager"))
		{
			empState = new Manager();
		}
		else
		{
			empState = new Developer();
		}
		
	}
}
