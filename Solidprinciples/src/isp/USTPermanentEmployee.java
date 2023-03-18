package isp;

public class USTPermanentEmployee implements BasicDetails, PfDetails {

	@Override
	public void updatePfDetails() {
		System.out.println("Updated basic Details");

	}

	@Override
	public void updateBasicDetails() {
		System.out.println("Updated pf Details");

	}

}
