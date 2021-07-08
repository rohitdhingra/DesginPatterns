package com.learning.behavioural.momento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Refrigerator
{
	private int price;
	private int volume;
	private boolean isPowerSaver;
	public Refrigerator(int price, int volume, boolean isPowerSaver) {
		super();
		this.price = price;
		this.volume = volume;
		this.isPowerSaver = isPowerSaver;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPowerSaver() {
		return isPowerSaver;
	}
	public void setPowerSaver(boolean isPowerSaver) {
		this.isPowerSaver = isPowerSaver;
	}
	@Override
	public String toString() {
		return "Refrigerator [price=" + price + ", volume=" + volume + ", isPowerSaver=" + isPowerSaver + "]";
	}
}

class Momento
{
	Refrigerator refri;

	public Momento(Refrigerator refri) {
		super();
		this.refri = refri;
	}

	public Refrigerator getRefri() {
		return refri;
	}

	public void setRefri(Refrigerator refri) {
		this.refri = refri;
	}

	@Override
	public String toString() {
		return "Momento [refri=" + refri + "]";
	}
	
}
class LivingAreaOriginator
{
	Refrigerator ref;

	public Refrigerator getRef() {
		return ref;
	}

	public void setRef(Refrigerator ref) {
		this.ref = ref;
	} 
	
	public Momento createMomento()
	{
		return new Momento(ref);
	}
	public void getMomento(Momento m)
	{
		 ref = m.getRefri();
	}

	@Override
	public String toString() {
		return "LivingAreaOriginator [ref=" + ref + "]";
	}
	
	
}

class CareTakerStore
{
	List<Momento> refLists = new ArrayList<>();
	
	public void addMomento(Momento m)
	{
		refLists.add(m);
	}
	public Momento getMomento(int index)
	{
		return refLists.get(index);
	}
}

public class MomentoDesignPattern {

	public static void main(String[] args) {

		LivingAreaOriginator originator = new LivingAreaOriginator();
		CareTakerStore careTaker = new CareTakerStore();
		originator.setRef(new Refrigerator(15000, 15, false));
		careTaker.addMomento(originator.createMomento());		
		originator.setRef(new Refrigerator(25000, 20, true));
		careTaker.addMomento(originator.createMomento());
		
		System.out.println("Current State of originator:"+originator);
		System.out.println("Restoring the old one");
		originator.getMomento(careTaker.getMomento(0));
		
		System.out.println("Current state after restoring"+originator);
		
		Date d;
		Serializable s;
		
	}

}
