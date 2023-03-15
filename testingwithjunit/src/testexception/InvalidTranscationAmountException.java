package testException;

public class InvalidTranscationAmountException extends RuntimeException {
	
        public void InvalidTransactionAmountException(String message)
        {
        	super(message);
        }
}
