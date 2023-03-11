package interthread1;

public class ConsumerInteger extends Thread {

	private DataBuffer sharedBuffer;

	public ConsumerInteger(DataBuffer sharedBuffer) {
		super("ConsumerInteger ");
		this.sharedBuffer = sharedBuffer;
	}
	
    public void run() {
    	
    	for (int i = 1; i <= 10; i++) {
			try {
				  Thread.sleep((int) (Math.random() * 3000));
			} catch (Exception e) {

			   System.err.println(e.toString());
			}
			sharedBuffer.getSharedInt();
		//System.err.println("ConsumerInteger retrievieng sharedBuffer value "+ sharedBuffer.getSharedInt());
    	}
    	System.err.println(getName() + "finished consuming values \n Terminating"+ getName());
    }	
	
	
	
}