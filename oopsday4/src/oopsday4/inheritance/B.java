package oopsday4.inheritance;

public class B extends A {  // A is the parent and B is the child.//
	 public B(){
		//super();
		//not allowed System.out.println("from B(int,int)");
		  super(10,20); // for constructor chaining
	}
}
