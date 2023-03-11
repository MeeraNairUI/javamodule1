package testlamdas;
interface factorial{
	double  fact (int n);
}
public class Factorial {
	public static void main(String[] args)
	{
		Runnable r1 = new Runnable ()
		{
			public void run()
			{
				System.out.println("from run method");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		factorial f = (int n) -> {
			int fact=1;
			for(int i=2;i<=n;i++) {
				fact=fact*i;
			};
			return fact;
		};
		double factorial=f.fact(5);
		System.out.println(factorial);
		
	}

}
