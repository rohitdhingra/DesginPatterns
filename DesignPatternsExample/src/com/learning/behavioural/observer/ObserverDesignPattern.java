package com.learning.behavioural.observer;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingListener;

interface SubjectLibrary
{
	public void subscribeObserver(Observer ob);
	
	public void unsubscribeObserver(Observer ob);
	
	public void notifyObserver();
}

interface Observer
{
	void update(String inStock);	
}

class EndUser implements Observer
{
	private String name;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EndUser(String name,SubjectLibrary subject) {
		super();
		this.name = name;
		subject.subscribeObserver(this);
	}

	@Override
	public void update(String inStock) {
		System.out.println("Hello"+name+"!we are glad to notify that your book has been available");
	}
	@Override
	public String toString() {
		return "EndUser [name=" + name + "]";
	}	
	
}

class Book implements SubjectLibrary
{

	private String name;
	private String type;
	private double price;
	private String author;
	private String inStock;
	private List<Observer> obsList = new ArrayList<>();
	
	public Book(String name, String type, double price, String author, String inStock) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.author = author;
		this.inStock = inStock;
	}
	
	

	public List<Observer> getObsList() {
		return obsList;
	}



	public void setObsList(List<Observer> obsList) {
		this.obsList = obsList;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getInStock() {
		return inStock;
	}



	public void setInStock(String inStock) {
		this.inStock = inStock;
		System.out.println("Availability changed from Sold out to Back in stock \n");
		notifyObserver();
	}



	@Override
	public void subscribeObserver(Observer ob) {
		obsList.add(ob);
	}

	@Override
	public void unsubscribeObserver(Observer ob) {
		obsList.remove(ob);
	}

	@Override
	public void notifyObserver() {
		System.out.println("Book name:"+this.name
				+", Book Type:"+ this.type
				+", Price:"+this.price
				+",Author:"+this.author
				+", is now"+this.inStock+".So please notify all users \n");
		
		for(Observer o : obsList)
		{
			o.update(this.inStock);
		}
	}
	
}


public class ObserverDesignPattern {

	public static void main(String[] args) {
		Book book = new Book("Learning Microservices","Technical",5000,"Willian Gilbert","SoldOut");
		EndUser rohit = new EndUser("Rohit",book);
		EndUser mohan = new EndUser("Mohan",book);
		
		List<Observer> obsList = book.getObsList();
		for(Observer ob: obsList)
		{
			EndUser eu = (EndUser) ob;
			System.out.println(eu +"has subscribed for "+ book.getName()+"Book");
		}
		
		System.out.println(book.getInStock());
		
		System.out.println("Book is now available");
		book.setInStock("Available");
		
		EventListener evList;
		HttpSessionBindingListener s;
		HttpSessionAttributeListener a;
		
	}

}
