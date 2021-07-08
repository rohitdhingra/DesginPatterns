package com.learning.behavioural.strategy;

public class StrategyDesignPattern {

	public static void main(String[] args) {
		Context con = new Context();
		con.setCompressionStrategy(new CompressToRAR());
		con.generateFile("abc.txt");
	}

}
