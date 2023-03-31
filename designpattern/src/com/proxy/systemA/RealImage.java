package com.proxy.systemA;

import com.proxy.iface.image;

public class RealImage implements image{
	private final String filename;

	public RealImage(String filename) {
		super();
		this.filename = filename;
		loadImageFromDisk();
	}

	private void loadImageFromDisk() {
		
		System.out.println("Loading ...... "+filename);
	}

	
	public void showImage() {
		
		System.out.println("Dispalying Image..... "+filename);
}


}
