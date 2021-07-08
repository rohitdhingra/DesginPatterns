package com.learning.structural.proxy;

public class ProxyDemo {

	public static void main(String[] args) {
		ProxyImage image = new ProxyImage();
		image.displayImage();
		
		ProxyImageCache cacheImageCache = new ProxyImageCache();
		cacheImageCache.displayImage();
	}

}
