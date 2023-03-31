package strategy.test;

import src.com.strategy.impI.FacebookStrategy;
import src.com.strategy.impI.GooglePlusStrategy;
import src.com.strategy.impI.OrkutStrategy;
import src.com.strategy.impI.TwitterStrategy;
import strategy.context.SocialMediaContext;

public class TestStrategy {

	public static void main(String[] args) {
		// Creating social Media Connect Object for connecting with friend by
	    // any social media strategy.
	    SocialMediaContext context = new SocialMediaContext();
	 
	    // Setting Facebook strategy.
	    context.setSocialmediaStrategy(new FacebookStrategy());
	    context.connect("James Gosling");
	 
	    System.out.println("====================");
	 
	    // Setting Twitter strategy.
	    context.setSocialmediaStrategy(new TwitterStrategy());
	    context.connect("Rod Johnson");
	 
	    System.out.println("====================");
	 
	    // Setting GooglePlus strategy.
	    context.setSocialmediaStrategy(new GooglePlusStrategy());
	    context.connect("Larry Page");
	 
	    System.out.println("====================");
	 
	    // Setting Orkut strategy.
	    context.setSocialmediaStrategy(new OrkutStrategy());
	    context.connect("Sundar");

	}

}
