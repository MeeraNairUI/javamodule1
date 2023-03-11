package statemachine;

import java.util.Scanner;

public class Ifunction implements Stateinf {
	Bankdemo objArr[]=new Bankdemo[2];
    Scanner sc=new Scanner(System.in);    
    double amount;
    
	@Override
	public double Amount() {
		objArr[0]=new Bankdemo(100,2);
		objArr[1]=new Bankdemo(50,5);
		BankDemo b1 = new BankDemo();
		int f=0;
		while(f<3) {
			f++;
			System.out.println("enter the amount");
			amount=sc.nextDouble();
			double dnt2=Denomination();
			for(int k=0;k<objArr.length;k++)
			{
				if(dnt2= objArr[k].value) {
					double co = objArr[k].getdCount();
				}
					
			}
			    if(amount%dnt2==0)
			     {
				       double div =amount/dnt2;
				       if()
			}
			}
	public double Denomination() {
		for(int i=0;i<objArr.length;i++)
		{
			System.out.println(objArr[i]);
		}
		System.out.println(" ");
		System.out.println("enter the denomination");
		Scanner sc1 = new Scanner(System.in);
		double dnt=sc1.nextInt();
		for(int j=0;j<objArr.length;j++) 
		{
			if(dnt==objArr[j].value)
			{
				return objArr[j].value;
			}
			else
			{
				System.out.println("not the correct denomination");
			}
			
		}
		
		
		
	}

	@Override
	@Override
	public double Balance() {
		// TODO Auto-generated method stub
		return 0;
	}

}
