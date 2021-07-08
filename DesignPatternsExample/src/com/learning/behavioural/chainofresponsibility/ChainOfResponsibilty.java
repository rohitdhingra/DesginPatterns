package com.learning.behavioural.chainofresponsibility;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.ServletException;


class Loan
{
	private int amount;

	public Loan(int amount) {
		super();
		this.amount = amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}
	
}

abstract class LoanApproval
{
	protected LoanApproval nextLoanApproval;

	
	public LoanApproval(LoanApproval nextLoanApproval) {
		this.nextLoanApproval = nextLoanApproval;
	}
	
	public abstract void approveLoan(Loan loan);	
}

class Manager extends LoanApproval
{
	
	public Manager(LoanApproval nextLoanApproval) {
		super(nextLoanApproval);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void approveLoan(Loan loan) {
		if(loan.getAmount()<100000)
		{
			System.out.println("Approved by manager..");
		}
		else
		{
			nextLoanApproval.approveLoan(loan);
		}
	}
	 
}

class Director extends LoanApproval
{
	
	
	public Director(LoanApproval nextLoanApproval) {
		super(nextLoanApproval);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void approveLoan(Loan loan) {
		if(loan.getAmount()<250000)
		{
			System.out.println("Approved by Director..");
		}
		else
		{
			nextLoanApproval.approveLoan(loan);
		}
	}
	 
}


class VP extends LoanApproval
{
	
	
	public VP(LoanApproval nextLoanApproval) {
		super(nextLoanApproval);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void approveLoan(Loan loan) {
//		if(loan.getAmount()<250000)
//		{
			System.out.println("Approved by VP..");
//		}
//		else
//		{
//			nextLoanApproval.approveLoan(loan);
//		}
	}
	 
}
public class ChainOfResponsibilty {
	public static void main(String[] args) throws IOException, ServletException {
		LoanApproval v = new VP(null);
		LoanApproval d = new Director(v);
		LoanApproval m = new Manager(d);
		Logger l = Logger.getLogger(ChainOfResponsibilty.class.getName());
		l.log(Level.INFO,"Routing the request");
		m.approveLoan(new Loan(500000));
//		Logger l = Logger.getLogger(ChainOfResponsibilty.class.getName());
//		l.log(Level.INFO,"Routing the request");
		Filter f = null;
		f.doFilter(null, null, null);
	}

}
