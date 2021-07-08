package com.learning.behavioural.statedesignpattern;

public class HR implements EmployeeState {

	@Override
	public void work() {
		System.out.println("Work: Recruitment resources for organization");
	}

	@Override
	public void canApproveLeave() {

		System.out.println("Can Approve Leaves: NO, HR can't approve the leaves.!\n");
	}

}
