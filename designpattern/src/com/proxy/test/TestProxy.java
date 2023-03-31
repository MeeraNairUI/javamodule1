package com.proxy.test;
import com.proxy.iface.image;
import com.proxy.systemA.RealImage;
import com.proxy.systemB.ProxyImage;

public class TestProxy {
     public static void main(String[] args) {
    	 	image image1 = new RealImage("HiRes_10MB_Photo1");
 		image image2 = new ProxyImage("HiRes_10MB_Photo2");

 		image1.showImage(); // loading necessary
 		image1.showImage(); // loading unnecessary
 		image2.showImage(); // loading necessary
 		image2.showImage(); // loading unnecessary
 		image1.showImage(); // loading unnecessary
     }
}
