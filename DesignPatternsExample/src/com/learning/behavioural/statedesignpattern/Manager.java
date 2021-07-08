package com.learning.behavioural.statedesignpattern;

public class Manager implements EmployeeState {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Work: Design the project architecture for the organization");
	}

	@Override
	public void canApproveLeave() {
		System.out.println("Can Approve Leaves: Yes, manager can approve leaves!\n");
	}

}
