package oopsday2.atm;

public interface BankingInf2 {
        
	    public double Withdraw(double amount,int actno); 
	    public double Deposit(double amount,int actno);
	    public double Balanceenquiry(int actno);
  }

