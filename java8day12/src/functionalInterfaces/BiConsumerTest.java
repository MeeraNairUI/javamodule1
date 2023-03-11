package functionalInterfaces;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
public class BiConsumerTest {
	public static void main(String args[])
	{
		Map<String,String> map = new HashMap<>();
	            map.put("ola","o");
	            map.put("Hello","h)");
                map.put("chao","c");
                
                
                map.forEach((k,v)->
                	System.out.println(k+" and "+v));
                
BiConsumer<String,String> bi = 
(k,v) -> System.out.println(k+ "For "+v);
}; 
}
