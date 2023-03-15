package testlamdas;

public class LambdaSwitchCase {
       static double calculate(String operator,double x, double y) {
       return switch(operator){
       case"+" -> x+y;
       case"-" -> x-y;
       case"*" -> x*y;
       case"/" -> {
    	   if(y==0) {
    		   throw new IllegalArgumentException("Can't divided by zero");
    	   }
    	   yield x/y;
       }
       default -> throw new IllegalArgumentException("unknown operator");
       };
       }                                           //// very imp....
 public static void main(String[] args) {
	 LambdaSwitchCase ls = new LambdaSwitchCase();
	 ls.calculate("+", 4,0);
	 ls.calculate("/",4,0);
	 ls.calculate("_",4,0);
	 ls.calculate("*",4,0);
	 
 }
}