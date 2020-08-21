package com.strategy.pattern;

public class Match {
	public static void main(String[] args) {
		Player ctx = new Player(Strategy.T20);
		ctx.play();
		
		ctx.setStrategy(Strategy.ONE_DAY);
		ctx.play();
		
		ctx.setStrategy(Strategy.TEST);
		ctx.play();
	}
}
