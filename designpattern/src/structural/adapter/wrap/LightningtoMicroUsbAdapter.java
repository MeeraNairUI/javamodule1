package structural.adapter.wrap;

import structural.adapter.phoneifaces.LightningPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;

public class LightningtoMicroUsbAdapter {
	public class LightningToMicroUsbAdapter implements MicroUsbPhone {
		
	    private final LightningPhone lightingPhone;

	    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
	        this.lightingPhone = lightningPhone;
	    }

	    @Override
	    public void useMicroUsb() {
	        System.out.println("MicroUsb connected");
	        lightingPhone.useLightning();
	    }

	    @Override
	    public void recharge() {
	        lightingPhone.recharge();
	    }
	}
}
