package src.com.strategy.impI;
import strategy.iface.ISocialMediaStrategy;

public class GooglePlusStrategy implements ISocialMediaStrategy {
	public void connectTo(String friendName) 
	  {
	    System.out.println("Connecting with " + friendName + " through GooglePlus");
	  }
}
