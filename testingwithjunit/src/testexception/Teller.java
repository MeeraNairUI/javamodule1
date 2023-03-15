package testexception;
import java.util.Arrays;
import java.util.List;
public class Teller {
        private static final List<String> acceptedCurrencies = Arrays.asList("EUR","USD");
        public static double validateTransaction(String currency,double amount) {
        	if (isCurrencyAccepted(currency) && isAmountValid(amount)) {

    			return amount;
    		}
    		return -1;
    	}

    	private static boolean isCurrencyAccepted(String currency) {
    		if (!acceptedCurrencies.contains(currency)) {
    			throw new IllegalArgumentException("Currency " + currency + " not accepted");

    		}
    		return true;
    	}

    	private static boolean isAmountValid(double amount) {

    		if (amount < 0)
    			throw new InvalidTransactionAmountException("Transaction not allowed for this " + amount);
    		return true;
    	}
        }
