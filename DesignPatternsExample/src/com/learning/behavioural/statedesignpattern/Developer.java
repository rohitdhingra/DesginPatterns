package com.learning.behavioural.statedesignpattern;

public class Developer implements EmployeeState{

	@Override
	public void work() {
		System.out.println("Work: Have to Complete the task assigned by Senior Manager");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can Approve Leaves: Yes Developer can approve the leaves of the trainee");
	}
	

}
