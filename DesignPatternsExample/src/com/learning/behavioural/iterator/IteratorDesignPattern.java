package com.learning.behavioural.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDesignPattern {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Rohit");
		list.add("Rahul");
		list.add("Anchal");
		list.add("Papa");
		list.add("Reyansh");
		list.add("Mumma");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Concrete Iterator"+itr.toString());
		
		Set<String> set = new HashSet<>();
		set.add("SetRohit");
		set.add("SetRahul");
		set.add("SetAnchal");
		set.add("SetPapa");
		set.add("SetReyansh");
		set.add("SetMumma");
		
		Iterator<String> setItr = set.iterator();
		System.out.println("Concrete Iterator"+setItr.toString());
		while(setItr.hasNext())
		{
			System.out.println(setItr.next());
		}
	}

}
