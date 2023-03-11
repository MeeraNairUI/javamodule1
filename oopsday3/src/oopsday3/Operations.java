package oopsday3;

public class Operations implements MathIface {
    private int number;
    public Operations() {
		
	}
    public Operations(int number) {
    	super();
    	this.number=number;
    }
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public int EvenorOdd() {
		if(this.number%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		return 0;

	}

	@Override
	public int PrimeorNot() {
		return 0;
	

	}

	@Override
	public int Factorial() {
		for(int i=0;i<number;i++) {
			if(number>1)
			{
				System.out.println("factorial");
			}
		}
			return 0;
		
		

	}

	@Override
	public int PosorNeg() {
		if(number>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.print("Negative");
		}
		return 0;

	}
	@Override
	public void Reverse() {
		int number=0;
		int Rev=0;
		while(number!=0) {
			int rem=number%10;
			Rev = Rev*10+ rem;
			number=number/10;
		
		System.out.println("Reverse of given number is " + Rev);
		
	}
	}

	@Override
	public int SumofNos() {
		for(int i=0;i<5;i++)
		{
			System.out.println("sum");
		}
		return 0;

	}

}
