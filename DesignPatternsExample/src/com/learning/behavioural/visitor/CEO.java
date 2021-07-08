package com.learning.behavioural.visitor;

public class CEO implements Visitor {
	
	private String ceoName;
	
	

	public CEO(String ceoName) {
		super();
		this.ceoName = ceoName;
	}


	public String getCeoName() {
		return ceoName;
	}


	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}


	@Override
	public void visit(Visitable vis) {
		Employee emp = (Employee)vis;
		emp.setPerformanceStatus("Good");
		
		System.out.println("This is to certify that "+emp.getName() + "performed"+emp.getPerformanceStatus()
		+" in his quarter year. This rating has been given by our CEO"+this.getCeoName()+". Thank you and All the bess for future");
	}

}
