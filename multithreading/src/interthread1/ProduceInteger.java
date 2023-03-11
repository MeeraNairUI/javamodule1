package interthread1;
public class ProduceInteger extends Thread {

	private DataBuffer sharedBuffer;

	public ProduceInteger(DataBuffer sharedBuffer) {
		super("ProduceInteger");
		this.sharedBuffer = sharedBuffer;
	}
	
    public void run() {
    	
    	for (int i = 1; i <= 10; i++) {
			try {
				  Thread.sleep((int) (Math.random() * 3000));
			} catch (Exception e) {

			   System.err.println(e.toString());
			}
		sharedBuffer.setSharedInt(i);
    	}
    	System.err.println(getName() + "finished producing values \n Terminating"+ getName());
    }	
	
	
	
}
