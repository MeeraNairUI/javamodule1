package oopsday2;

public class Carfactory {
	public static void main(String[] args) {
		carIface car =  new Car(5000,500,0,false);
		System.out.println(car);
		car.start();
		car.move();
		car.honk();
		car.stop();
		System.out.println(car);
	}

}
