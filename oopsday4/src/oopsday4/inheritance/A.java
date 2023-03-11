package oopsday4.inheritance;

public class A {
	private int x;
	private int y;////private is only to base class so it gives an error.
	A(){
		System.out.println("from A()");
	}
	public A(int x,int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("from A(int,int)");
	}
}
