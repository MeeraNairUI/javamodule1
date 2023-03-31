package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightningPhone;

public class Iphone implements LightningPhone {
	public boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}else {
			System.out.println("Connect Lightning");
		}

	}

	@Override
	public void useLightning() {
		connector=true;
		System.out.println("Lightning connected");


	}

}
