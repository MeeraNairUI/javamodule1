package listdemo;
import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList flowers = new ArrayList();
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add("Tulips");
		flowers.add("Rose");
		flowers.add("Jasmine");
		flowers.add("lilly");
		flowers.add("cosmos");
		
		String str = (String) flowers.get(3);
		System.out.println(flowers);
		System.out.println(flowers.size());
		System.out.println(flowers.get(2));
		System.out.println(flowers.contains("Lilly"));  ////// elements are case sensitive////
		flowers.add(2,"sunflower");
		
		for(Object obj:flowers) {
			System.out.println(obj);
		}
		flowers.remove(2);
		System.out.println(flowers);
Iterator iter = flowers.iterator();
while(iter.hasNext()) {
	System.out.println(iter.next());
}
for(int i=0;i<flowers.size();i++) {
	System.out.println(flowers.get(i));
}
Object obj = flowers.get(3);
if(obj instanceof Integer) {
	Integer in =(Integer) obj;
}
else if(obj instanceof Double) {
	Double d= (Double) obj;
}
else if(obj instanceof String) {
	String str1 = (String)obj;
	System.out.println(str.toUpperCase());
}

}
	
}
