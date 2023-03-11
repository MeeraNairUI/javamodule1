package testlamdas;

interface Math{
	double power(int b,int e);
}
public class Example1 {
      public static void main(String[] args)
      {
    	  Runnable r1 = new Runnable() 
    	  {
    		  public void run()
    		  {
    			  System.out.println("from run method");
    		  }
    	  };
    	  Thread t1 = new Thread(r1);
    	  t1.start();
 
    	  Runnable r = ()->{
    		  for(int i=1;i<5;i++) {
    			  System.out.println("in run method"+i);
    		  }
    	  };
    	  
    	  Thread t = new Thread(r);
    	  t.start();
    	  
    	  Math m = (int b,int e)->{
    		  int p=1;
    		  for(int i=1;i<=e;i++) {
    			  p*=b;
    		  }
    		  return p;
    	  };
    	  double p =m.power(2,3);
    	  System.out.println(p);
    	  
      }
}

