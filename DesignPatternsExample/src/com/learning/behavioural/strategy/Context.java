package com.learning.behavioural.strategy;

public class Context {

	private Strategy compressionStrategy;

	public void setCompressionStrategy(Strategy compressionStrategy) {
		this.compressionStrategy = compressionStrategy;
	}
	
	public void generateFile(String file)
	{
		compressionStrategy.compressFile(file); 
	}
	
}
