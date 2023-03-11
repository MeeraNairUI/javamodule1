package oopsday4.polymorphism;

public class Square extends shape{
	private double side;
	public Square() {
}
	public Square(double side) {
		super();
		this.side=side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side=side;
	}
	public double area() {
		return this.side*this.side;
	}

}
