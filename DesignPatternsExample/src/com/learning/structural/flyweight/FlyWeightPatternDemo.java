package com.learning.structural.flyweight;

public class FlyWeightPatternDemo {
	public static void main(String[] args) {
		Bucket bucket = new Bucket();
		bucket.executeOrder("F41", 1);
		bucket.executeOrder("Sony LED", 2);
		bucket.executeOrder("Whirlpool Fridge", 3);
		bucket.executeOrder("G5s", 4);
		bucket.executeOrder("Whirlpool Fridge", 5);
		
		bucket.process();
		
		System.out.println(bucket.getTotalProducts());
		
	}
}
