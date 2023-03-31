package factorymethod;

public class Xcross implements VehicleIface {

	@Override
	public void start() {
		System.out.println("started...."+ getClass());

	}

	@Override
	public void stop() {
		System.out.println("stopped...."+getClass());

	}

	@Override
	public void honk() {
		System.out.println("palm palm..."+getClass());

	}

	@Override
	public void move() {
		System.out.println("its moving....."+getClass());

	}

}
