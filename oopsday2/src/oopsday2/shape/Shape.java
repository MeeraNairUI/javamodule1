package oopsday2.shape;

import java.util.Scanner;

public class Shape {
	public static void main(String[] args) {
		
		Rectangle Rectangle = new Rectangle ();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth");
		
		int l=sc.nextInt();
		int b=sc.nextInt();
		Rectangle.setLength(l);
		Rectangle.setBreadth(b);
		Rectangle.area();
	}
}
