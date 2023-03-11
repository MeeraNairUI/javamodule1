package interthread1;

public class DataBuffer {

	
	private int sharedInt = -1;
	public void setSharedInt(int value) {
		
		System.err.println(Thread.currentThread().getName()+ "setting sharedBuffer to" + value);
		sharedInt = value;
	}
	
	public int getSharedInt() {
		
		System.err.println(Thread.currentThread().getName() + "retrieving sharedBuffer value "+ sharedInt);
		return sharedInt;
	}
}


