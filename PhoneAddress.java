package my_project;

public class PhoneAddress {

	private PhoneType phoneType;
	private String number;
	private int phoneId;
	
	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
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
	public PhoneAddress(PhoneType phoneType, String number, int phoneId) {
		this.phoneId = phoneId;
		this.phoneType = phoneType;
		this.number = number;
	}
	PhoneAddress(String number){
		this.number =number;
	}
}
