package oopsday3.atm.NegativeAmountexception;
public class NegativeAmountException extends Exception {
	public NegativeAmountException() {
	}

	public NegativeAmountException(String msg) {
		super(msg);
	}
	public String getMessage() {
	      return super.getMessage();
	}
}
