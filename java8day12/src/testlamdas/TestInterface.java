package testlamdas;

public interface TestInterface {
	public double method();
	public default void method2() {
		System.out.println("from method2");
	}
	public static void method3() {
		System.out.println("from static method");
	}

}
