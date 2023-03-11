package oopsday4.polymorphism;

public class Circle extends shape {
      private double radius;
      public Circle() {
 }
 public Circle(double radius)
 {
	 super();
	 this.radius=radius;
 }
 public double getRadius() {
	 return radius;
 }
 public void setRadius(double radius) {
	 this.radius = radius;
 }
 public double area() {
	 return Math.PI*this.radius*this.radius;
 }
}
