package com.learning.structural.adapter;
interface ISpeakFrench
{
	public void speakFrench();
}

class FrenchPerson implements ISpeakFrench
{

	@Override
	public void speakFrench() {
		System.out.println("French French");
	}
	
}

interface ISpeakEnglish
{
	public void speakEnglish();
}

class EnglishPerson implements ISpeakEnglish
{

	@Override
	public void speakEnglish() {
		System.out.println("English English");
	}
	
}

class FrenchtoEnglishAdapter implements ISpeakEnglish
{
	ISpeakFrench french;
	
	
	public FrenchtoEnglishAdapter(ISpeakFrench french) {
		super();
		this.french = french;
	}



	@Override
	public void speakEnglish() {
		this.french.speakFrench();
		System.out.println("Converting into the Brain....");
		System.out.println("English English");
	}
	
}
public class AdapterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrenchtoEnglishAdapter translator = new FrenchtoEnglishAdapter(new FrenchPerson());
		translator.speakEnglish();
	}

}
