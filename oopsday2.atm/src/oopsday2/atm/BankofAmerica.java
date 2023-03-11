package oopsday2.atm;

public class BankofAmerica implements BankingInf {

	private Account account = new Account(10010, "John Doe", "salary", 500);

	@Override
	public double Withdraw(double amount) {
		account.setBalance(account.getBalance() - amount);
		return account.getBalance();
	}

	@Override
	public double Deposit(double amount) {
		account.setBalance(account.getBalance() + amount);
		return account.getBalance();
	}

	@Override
	public double Balanceenquiry(int actno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
