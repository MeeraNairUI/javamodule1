package listdemo;
import java.util.HashMap;
public class FrequencyHashMapTest {
	
	public static void main(String[] args)
	{
		
	String str ="All general-purpose Collection implementation classes (which typically implement Collection indirectly through one of its subinterfaces) should provide two \"standard\" constructors: a void (no arguments) constructor, which creates an empty collection, and a constructor with a single argument of type Collection, which creates a new collection with the same elements as its argument. In effect, the latter constructor allows the user to copy any collection, producing an equivalent collection of the desired implementation type. There is no way to enforce this convention (as interfaces cannot contain constructors) but all of the general-purpose Collection implementations in the Java platform libraries comply.The \"destructive\" methods contained in this interface, that is, the methods that modify the collection on which they operate, are specified to throw UnsupportedOperationException if this collection does not support the operation. If this is the case, these methods may, but are not required to, throw an UnsupportedOperationException if the invocation would have no effect on the collection. For example, invoking the addAll(Collection) method on an unmodifiable collection may, but is not required to, throw the exception if the collection to be added is empty.";
    String[] strArr = str.split(" ");
    System.out.println(strArr.length);
    HashMap<String,Integer> map1 = new HashMap<>();
    
    for(String str1:strArr)
    {
		if(map1.get(str1)== null)
		{
    	    map1.put(str1,1);
		}
		else
		{
			int i=map1.get(str1);
			i++;
			map1.put(str1, i);
		}
		
    }		
    System.out.println(map1);
}
}