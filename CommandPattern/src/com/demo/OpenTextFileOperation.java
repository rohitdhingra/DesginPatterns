package com.demo;

public class OpenTextFileOperation implements TextFileOperation{

	private TextFile textFile;
	
	public OpenTextFileOperation(TextFile textFile2) {
		textFile = textFile2;
	}

	@Override
	public String execute() {
		return textFile.open();
	}

}
