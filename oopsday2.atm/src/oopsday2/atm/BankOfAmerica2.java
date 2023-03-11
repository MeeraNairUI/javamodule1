package oopsday2.atm;

public class BankOfAmerica2 implements BankingInf2 {
	private Account []accounts = new Account[5];
	private int accountIndex = 0;
	
	public BankOfAmerica2() {
		
	}
	public BankOfAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	
	
	public void addAccount(Account account) {
	    if(this.accountIndex < accounts.length)
		      accounts[this.accountIndex++] = account;
	    else
	         System.out.println("operation not allowed");
	}
	public Account transactionAccount(Account account) {
		return account;
	}
	@Override
	public double Withdraw(double amount,int actno) 
	{
		double tempBal=0;
		   for(int i=0;i<accounts.length;i++) {
			   
			   if(accounts[i].getActno() == actno) {
				   
				   tempBal = accounts[i].getBalance();
				   tempBal -=amount;
				   accounts[i].setBalance(tempBal);
				   break;
			   }
		}
		   
		   return tempBal;
		   
	}
	@Override
	public double Deposit(double amount,int actno) 
	{
		double tempBal=0;
		   for(int i=0;i<accounts.length;i++) {
			   
			   if(accounts[i].getActno() == actno) {
				   
				   tempBal = accounts[i].getBalance();
				   tempBal +=amount;
				   accounts[i].setBalance(tempBal);
			   }
		}
		   return tempBal;
	}
	
	public double Balanceenquiry(double amount,int actno) 
	{
		double tempBal=0;
		   for(int i=0;i<accounts.length;i++) {
              if(accounts[i].getActno() == actno) {
				   
				   tempBal = accounts[i].getBalance();
		   }
		   }
		   return tempBal;
	}
			   
	public void displayAccount(int actno) {
		for(int i=0;i<accounts.length;i++)
			if(accounts[i].getActno()==actno)
			{
				System.out.println(accounts[i].getActno());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getActType());
				System.out.println(accounts[i].getBalance());
				break;
			}
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public int getAccountIndex() {
		return accountIndex;
	}
	public void setAccountIndex(int accountIndex) {
		this.accountIndex = accountIndex;
	}
	@Override
	public double Balanceenquiry(int actno) {
		double tempBal=0;
		   for(int i=0;i<accounts.length;i++) {
           if(accounts[i].getActno() == actno) {
				   
				   tempBal = accounts[i].getBalance();
		   }
		   }
		   return tempBal;
	}
}

