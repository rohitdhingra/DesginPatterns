package com.demo;

public class SaveTextFileOperation implements TextFileOperation{
	
	private TextFile textFile;

	public SaveTextFileOperation(TextFile textFile2) {
		textFile = textFile2;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return textFile.save();
	}

}
