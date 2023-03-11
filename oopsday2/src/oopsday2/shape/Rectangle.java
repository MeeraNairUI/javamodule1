package oopsday2.shape;

public class Rectangle implements ShapeIface {

	
	private int length;
	private int breadth;
	
	public Rectangle() {
		
	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public void area(){
		int area = length * breadth;
		System.out.println(area);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	
	


}
