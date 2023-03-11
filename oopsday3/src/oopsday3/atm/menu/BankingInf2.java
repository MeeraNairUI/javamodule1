package oopsday3.atm.menu;

import oopsday3.atm.NegativeAmountexception.NegativeAmountException;
import oopsday3.atm.exception.Insufficientfundsexception;

public interface BankingInf2 {
        
	    public double Withdraw(double amount,int actno) throws Insufficientfundsexception;
	    public double Deposit(double amount,int actno) throws NegativeAmountException;
	    public double Balanceenquiry(int actno);
  }

