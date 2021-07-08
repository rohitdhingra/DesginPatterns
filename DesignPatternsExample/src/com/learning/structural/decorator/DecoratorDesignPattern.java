package com.learning.structural.decorator;

interface Burger
{
	public void makeBurger();
}

class PlainBurger implements Burger
{

	@Override
	public void makeBurger() {
		System.out.println("Plain Burger is ready");
	}
}

abstract class BurgerDecorator extends PlainBurger
{
	protected Burger burger;

	public BurgerDecorator(Burger burger) {
		super();
		this.burger = burger;
	}
	
	public void makeBurger()
	{
		burger.makeBurger();
	}
}

class CheeseBurgerDecorator extends BurgerDecorator
{

	public CheeseBurgerDecorator(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeBurger() {
		// TODO Auto-generated method stub
		burger.makeBurger();
		System.out.println(", Cheese Added");
	}
		
}

class BarbequeBurgerDecorator extends BurgerDecorator
{

	public BarbequeBurgerDecorator(Burger burger) {
		super(burger);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeBurger() {
		// TODO Auto-generated method stub
		burger.makeBurger();
		System.out.println(", Vegetables and Cheese Added");
	}
		
}


public class DecoratorDesignPattern {

	public static void main(String[] args) {

		Burger burger = new PlainBurger();
		burger.makeBurger();
		
		new CheeseBurgerDecorator(burger).makeBurger();
		new BarbequeBurgerDecorator(burger).makeBurger();
	}

}
