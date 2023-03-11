package oopsday4.statictest;

public class TestStaticDemo {
  public static void main(String[] args) {
	  
	  System.out.println(Staticdemo.a);
	  Staticdemo d = new Staticdemo();
	  System.out.println(d.a);
	  Staticdemo d1 = new Staticdemo();
	  System.out.println(d1.a);
	  Staticdemo d2 = new Staticdemo();
	  System.out.println(d2.a);
	  System.out.println(Staticdemo.a);
  }
}