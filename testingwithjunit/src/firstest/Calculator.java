package firstest;

public class Calculator {
       public int power(int b,int e) {
    	   int p=1;
    	   int i=1;
    	   if(b==0 || e==0)
    		   return 0;
    	   else {
    		   while(i<=e) {
    			   p*=b;
    		   }
    	   }
    	   return p;
       }
       
public int Factorial(int n){
	//public int fact(int n) {
		int i, fact =1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

