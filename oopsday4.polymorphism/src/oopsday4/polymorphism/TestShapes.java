package oopsday4.polymorphism;

public class TestShapes {
	public static void main(String[] args) {
	shape s = new Rectangle(10.24,30.40);
		double result = s.area();
		System.out.println(result);
		
		s = new Circle(34);
		result = s.area();
		System.out.println(result);
		
		s = new Square(10.25);
		result = s.area();
		System.out.println(result);
	}

}
