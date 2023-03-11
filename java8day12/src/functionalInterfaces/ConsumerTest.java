package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {                       // takes input does not give output.
	public static void main(String[] args)
	{
		List<String> strings = Arrays.asList("Andhra Pradesh", "Tamilnadu","Telegana","Kerala", "karnataka");
		Consumer<String> consumer = (str)->{
			
			System.out.println(str);
		};
	
consumer.accept("I am doing great");
   for(String str:strings) 
   {
	   consumer.accept(str);              // accept
    }

printStrings(strings,consumer);
}// end of main

public static void printStrings(List<String> strings, Consumer<String> c) {
for(String str: strings) {
     c.accept(str);
}
}
}