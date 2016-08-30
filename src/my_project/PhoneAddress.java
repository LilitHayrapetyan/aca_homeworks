package my_project;

public class PhoneAddress {

	private PhoneType phoneType = PhoneType.homePhoneNumber;
	private String number;
	public PhoneType getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneAddress(PhoneType phoneType, String number) {
		this.phoneType = phoneType;
		this.number = number;
	}
}
