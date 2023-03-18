package lsp;

public class Rectangle implements Shape {
           private int length;
           private int breadth;
           
           public Rectangle(int length,int breadth) {
        	   this.length=length;
        	   this.breadth=breadth;
           }
           public int getArea() {
        	   return this.length*this.breadth;
           }
}
