package com.learning.behavioural.mediator;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

abstract class User
{
	protected Mediator mediator;
	protected String name;
	public User(Mediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String message);
	public abstract void receive(String message);
}

interface Mediator{

	public void sendMessage(String message, User user);
	public void registerUser(User user);
	
}

class MediatorImpl implements Mediator
{

	private List<User> users;
	
	
	
	public MediatorImpl() {
		super();
		this.users = new ArrayList<>();
	}

	public MediatorImpl(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public void sendMessage(String message, User user) {
		for(User u: this.users)
		{
			if(u != user)
			{
				u.receive(message);
			}
		}
	}

	@Override
	public void registerUser(User user) {
		this.users.add(user);
	}
	
}

class UserImpl extends User
{

	public UserImpl(Mediator mediator, String name) {
		super(mediator, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		System.out.println(this.name+": Sending message: "+message);
		mediator.sendMessage(message,this);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name+": Recieving message: "+message);
		
	}
	
}

public class MediatorDesignPattern {

	public static void main(String[] args) {
		Mediator mumma = new MediatorImpl();
		User rohit = new UserImpl(mumma,"Rohit");
		User aanchal = new UserImpl(mumma,"Anchal");
		User rajat = new UserImpl(mumma,"Rajat");
		User jasleen = new UserImpl(mumma,"Jasleen");
		mumma.registerUser(rohit);
		mumma.registerUser(aanchal);
		mumma.registerUser(rajat);
		mumma.registerUser(jasleen);
		
		aanchal.send("Hi Rohit");
		
		ScheduledExecutorService s;
		ExecutorService e;
		Executor ex;
		Timer t;
		Method m;
	}

}
