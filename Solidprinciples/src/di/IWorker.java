package di;

interface IWorker {
    public void work() {
    	
    }
    class Worker implements IWorker{
    	public void work() {
    		
    	}
    	class Manager{
    		IWorker worker;
    		public void setWorker(IWorker a) {
    			worker=w;
    		}
    		public void manage() {
    			worker.work();
    		}
    	}
    }
}
