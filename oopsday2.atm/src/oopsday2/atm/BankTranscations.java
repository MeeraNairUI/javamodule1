package oopsday2.atm;

public interface BankTranscations {
          public static void main(String[] args) {
        	  
        	  BankingInf bom = new BankofAmerica();
        	  
        	  double balance = bom.Deposit(250);
        	  System.out.println("balance after deposit = $" + balance);
        	  balance = bom.Withdraw(175.25);
        	  System.out.println("balance after withdraw = $" + balance);
          }
}
