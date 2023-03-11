package functionalInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalItest {
      
	public class TestFunctionalInterfaces {

		public static void main(String[] args) {
			List<String> strings = Arrays.asList("Andhra Pradesh", "Tamilnadu","Telangana","Kerala","Karnataka");
			
			Function<String,Integer> f = (str)->
			{ return str.length();
			
			};
			Function<String,String> f1 = (str)->
			{
				return str.toUpperCase();
			};
			Function<String,String> f2 =(str)->
			{
				return str.toLowerCase();
			};
			Function<String,String> f3 = (str)->
			{
				//return str.toReverse();
				StringBuilder sb = new StringBuilder(str);
				sb.reverse();
				String rev = sb.toString();
				return rev;
			};
//Function for uppercase
//Function for lowercase
//Function for reverse
		}
	}
	
	
	public static void printLength(List<String> strings,Function<String,Integer> fRef) 
	{
	    for(String str:strings) {
		   System.out.println(fRef.apply(str));
	    }
	}
	    public static void toUpperCase(List<String> strings,Function<String,String> fRef)
	    {
	    	for(String str:strings) {
	    		
				System.out.println(fRef.apply(str));
	    	}
	    }
	    public static void toLowerCase(List<String> strings,Function<String,String> fRef)
	    {
	    	for(String str:strings) {
	    		
				System.out.println(fRef.apply(str));
	    	}
	    }
	    public static void toReverse(List<String> strings,Function<String,String> fRef)
	    {
	    	for(String str:strings) {
	    		
				System.out.println(fRef.apply(str));
	    	}
	    }
	}
	