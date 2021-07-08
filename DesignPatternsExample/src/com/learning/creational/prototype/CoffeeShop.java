package com.learning.creational.prototype;

import java.util.ArrayList;
import java.util.List;


public class CoffeeShop implements Cloneable
{
	String shopName;
	List<Coffee> coffeeTypes = new ArrayList<>();
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Coffee> getCoffeeTypes() {
		return coffeeTypes;
	}
	public void setCoffeeTypes(List<Coffee> coffeeTypes) {
		this.coffeeTypes = coffeeTypes;
	}
	@Override
	public String toString() {
		return "CoffeeShop [shopName=" + shopName + ", coffeeTypes=" + coffeeTypes + "]";
	}
	
	public void loadStock()
	{
		for(int i=0;i<=2;i++)
		{
			Coffee c  = new Coffee();
			c.setCoffeeId(i);
			c.setCoffeeName("CoffeeName"+i);
			getCoffeeTypes().add(c);
		}
	}
	@Override
	protected CoffeeShop clone() throws CloneNotSupportedException {

		CoffeeShop cShop = new CoffeeShop();
		for(Coffee c : this.getCoffeeTypes())
		{
			cShop.getCoffeeTypes().add(c);
		}
		
		return cShop;
	}
	
	
}
