package oopsday2.atm;

public class BankTransactions2 {
	
	public static void main(String[] args) {
		Account a1 = new Account(101,"John Doe","savings",500);
		Account a2 = new Account(102,"Jone Doe","savings",700);
		Account a3 = new Account(103,"Jason Doe","salary",850);
		Account a4 = new Account(104,"Jane Doe","salary",250);
		Account a5 = new Account(105,"Jonas Doe","pension",650);
		
		BankOfAmerica2 boa = new BankOfAmerica2 ();
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
		
		System.out.println(boa.Balanceenquiry(103));
		double result = boa.Deposit(100,103);
		System.out.println(result);
		result = boa.Withdraw(50, 103);
		System.out.println(result);	
	}

}
