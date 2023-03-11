package oopsday4.statictest;

public class Staticdemo2 {
	static int a;
	public static void method() {
		System.out.println("from method"+a);
		//method2() ; is not-static
	}
	public void method2() {
		System.out.println(a);
		method();
	}
}