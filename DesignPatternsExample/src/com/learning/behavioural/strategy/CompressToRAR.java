package com.learning.behavioural.strategy;

public class CompressToRAR implements Strategy {

	@Override
	public void compressFile(String fileName) {
		System.out.println(fileName +"has been successfully converted to .rar file...");
	}

}
