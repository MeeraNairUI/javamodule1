package string;

public class StringDemo {
  

public static void main(String [] args) {
	   
	   String str= new String("16-11-477/6/A/3 Hyderabad 500036");
	   int digit=0;
	   int letter=0;
	   int non=0;
	   for(int i=0;i<str.length();i++) 
	   {
		   char c = str.charAt(i);
		   if(Character.isDigit(c)) {
			   digit++;
		   }
		   else if(Character.isLetter(c)) {
			   letter++;
		   }
		   else {
			   non++;
		   }
		   
	   }
	   System.out.println(digit);
	   System.out.println(letter);
	   System.out.println(non);
}
}
	   
   
