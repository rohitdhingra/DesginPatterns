package com.learning.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class Organization {
	static List<Employee> empList;
	
	static {
		empList = new ArrayList<>();
		empList.add(new Employee("Rohit"));
		empList.add(new Employee("Anchal"));
		empList.add(new Employee("Rahul"));
		empList.add(new Employee("Rajat"));
		empList.add(new Employee("Jasleen"));
	}
	
	public static void ratings()
	{
		CEO ceo = new CEO("Sh B.N Dhingra");
		for(Employee e: empList)
		{
			e.accept(ceo);
		}
	}
}
