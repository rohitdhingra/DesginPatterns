package com.demo;

public class TextFile {
	private String name;

	public TextFile(String string) {
		name = string;
	}

	public String open() {
		return "Opening File " + name;
	}

	public String save() {
		return "Saving File " + name;
	}
}
