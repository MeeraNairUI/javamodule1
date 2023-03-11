package multithreading;

public class MyThread extends Thread {
	private String name;
    public MyThread() {
    	
    }
    public MyThread(String name) {
    	this.name = name;
    }
public void run() {
	for(int i=1;i<=600;i++) {
		System.out.println(name +"="+i);
	}
}
}