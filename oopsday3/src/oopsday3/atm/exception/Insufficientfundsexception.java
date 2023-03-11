package oopsday3.atm.exception;

public class Insufficientfundsexception extends Exception{

	public Insufficientfundsexception() {
	}
	public Insufficientfundsexception(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
