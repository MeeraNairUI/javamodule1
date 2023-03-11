package listdemo;
import java.util.TreeSet;
import java.util.Iterator;
public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet<String> bookSet = new TreeSet<>();
		bookSet.add("Java in nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in java");
		bookSet.add("java in 21 days");
		bookSet.add("java for dummys");
		bookSet.add(null);   // TreeSet does not allows null values or null element..//
      System.out.println(bookSet);
      System.out.println(bookSet.size());
      System.out.println(bookSet.contains ("Java in nutshell"));
      
      bookSet.add("Thinking in java");
      System.out.println(bookSet.size());
       for(String book:bookSet) {
	      System.out.println(book);
         }
       Iterator<String> iter = bookSet.iterator();
       while(iter.hasNext()) {
    	   System.out.println(iter.next());
       }
	}
}
      