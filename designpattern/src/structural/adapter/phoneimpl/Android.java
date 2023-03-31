package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	public boolean connector;

	@Override
	public void recharge() {
		if(connector) {
			System.out.println("recharge started");
			System.out.println("recharge finished");
		}else {
			System.out.println("Connect Micro Usb");
		}

	}

	@Override
	public void useMicroUsb() {
		connector=true;
		System.out.println("MicroUsb connected");

	}

}
