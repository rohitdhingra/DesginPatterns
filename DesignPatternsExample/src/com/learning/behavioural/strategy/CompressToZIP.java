package com.learning.behavioural.strategy;

public class CompressToZIP implements Strategy {

	@Override
	public void compressFile(String fileName) {
		System.out.println(fileName +"has been successfully converted to .zip file...");
	}

}
