package oopsday4.composition;
import java.util.Objects;


public class Address {
	private String doorNo;
	private String buildingName;
	private String street;
	private String city;
	private Long pin;
	private Address residenceAddress;
	private Address correspondenceAddress;
	

	public Address(String doorNo, String buildingName, String street, String city, Long pin) {
		super();
		this.doorNo = doorNo;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", buildingName=" + buildingName + ", street=" + street + ", city=" + city
				+ ", pin=" + pin + "]";
	}
	

}
