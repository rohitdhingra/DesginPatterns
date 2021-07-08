package com.learning.structural.bridge;

abstract class Template
{
	protected Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public abstract void designWall(); 
	
}

class ButterflyWallArt extends Template
{

	@Override
	public void designWall() {
		// TODO Auto-generated method stub
		System.out.println("Designing the wall with Butterfly wall art...");
		if(color!=null)
			color.pickColour();
	}
	
}

class TreeWallArt extends Template
{

	@Override
	public void designWall() {
		// TODO Auto-generated method stub
		System.out.println("Designing the wall with Tree wall art...");
		if(color!=null)
			color.pickColour();
	}
	
}

interface Color
{
	public void pickColour();
}

class Blue implements Color
{

	@Override
	public void pickColour() {
		// TODO Auto-generated method stub
		System.out.println("Blue colour picked for the wall");
	}
	
}
class Red implements Color
{

	@Override
	public void pickColour() {
		System.out.println("Red colour picked for the wall");		
	}
	
}

public class BridgeDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Template art1 = new ButterflyWallArt();
		Template art2 = new TreeWallArt();
		
		Color blue = new Blue();
		Color red = new Red();
		
		art1.setColor(blue);
		art2.setColor(red);
		
		art1.designWall();
		art2.designWall();
	}

}
