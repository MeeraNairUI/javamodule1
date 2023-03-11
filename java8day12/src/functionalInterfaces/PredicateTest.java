package functionalInterfaces;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;


public class PredicateTest {
     public static void main(String[] args) {
    	 List<String> strings = Arrays.asList("Andhra Pradesh", "Tamilnadu","Telegana","Kerala", "karnataka");
    	 Predicate<String> p = (String str) ->{
    		 return str.length()>10;
    	 };
    	 System.out.println(p.test("Holla!"));
    	 for(String str:strings)
    		 System.out.println(p.test(str));
     }
     public static void longString(List<String> strings, Predicate<String> p) {
	for(String str:strings)
    	 System.out.println(p.test(str));
     }
}

