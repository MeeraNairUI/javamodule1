package interthread1;

public class TestProducerConsumer { 

	public static void main(String[] args) {

		DataBuffer sharedObject = new DataBuffer();
		ProduceInteger producer = new ProduceInteger(sharedObject);
		ConsumerInteger consumer = new ConsumerInteger(sharedObject);
		
		producer.start();
		consumer.start();
		
	}

}
