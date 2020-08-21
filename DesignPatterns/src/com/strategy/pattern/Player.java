package com.strategy.pattern;

public class Player {

	private Strategy battingStrategy;
	
	public Player(Strategy strategy) {
		// TODO Auto-generated constructor stub
		battingStrategy = strategy;
	}
	
	public void setStrategy(Strategy strategy)
	{
		this.battingStrategy = strategy;
	}
	
	public void play()
	{
		this.battingStrategy.play();
	}

}
