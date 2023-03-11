package listdemo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap<String,String> countryCurr = new TreeMap<>();
		countryCurr.put("IND","Rupe");
		countryCurr.put("USA","dollar");
		countryCurr.put("UK", "pound");
	System.out.println(countryCurr);
    System.out.println(countryCurr.get("IND"));
    
    countryCurr.put("IND","Rupee");
    System.out.println(countryCurr.size());
    System.out.println(countryCurr.containsKey("UK"));
    System.out.println(countryCurr.containsValue("Dollar"));
// Hashmap has 3 views.
//1. key view
     Set<String> keys = countryCurr.keySet();
     for(String key : keys) {
    	 System.out.println(key);
     }
     
     // 2. values view
     Collection<String> values = countryCurr.values();
     for(String value:values) {
    	 System.out.println(value);
     }
     
     //3. key values together - entry set
     Set<Entry<String,String>> entries = countryCurr.entrySet();
     for(Entry <String,String>entry : entries) {
    	 System.out.println(entry);
     }
	}
}