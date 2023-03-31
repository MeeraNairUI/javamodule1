package src.com.strategy.impI;

import strategy.iface.ISocialMediaStrategy;

public class OrkutStrategy  implements ISocialMediaStrategy{
            public void connectTo(String friendName) {
            	System.out.println(
            	"Connecting with"+ friendName +" through Orkut");
            	}
            }

