package com.learning.structural.proxy;

public interface Image {
	public void displayImage();
}

class ActualImage implements Image
{

	@Override
	public void displayImage() {
		System.out.println("This is real image...");
	}
	
}
//Protection proxy
class ProxyImage implements Image
{
	ActualImage realImage;

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("Checking the access rights");
		System.out.println("Everything is good");
		realImage = new ActualImage();
		realImage.displayImage();
	}
	
}
// Remote Proxy
class ProxyImageCache implements Image
{

	ActualImage realImage;
	
	@Override
	public void displayImage() {
		// Check if object is there in cache.. else fetch the new object and send
		System.out.println("Object is not there");
		realImage = new ActualImage();
		realImage.displayImage();
		
	}
	
}