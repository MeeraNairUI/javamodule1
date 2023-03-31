package com.proxy.systemB;

import com.proxy.systemA.RealImage;
import com.proxy.iface.*;

public class ProxyImage implements image {
	private final String filename;
	private RealImage image;

	public ProxyImage(String filename) {
		this.filename = filename;
	}

	public void showImage() {
		
		if (image == null) {
			image = new RealImage(filename);
		}
		image.showImage();
	}
}
