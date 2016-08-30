package my_project;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usrname;
	UserName username = new UserName(usrname);
	private String password;
	private PhoneType phoneType;
	private String number;
	//private PhoneType phoneType = PhoneType.homePhoneNumber;
	//private String number;
	PhoneAddress phone =new  PhoneAddress(phoneType, number);
	
	
	public UserName getUsername() {
		return username;
	}

	public void setUsername(UserName username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PhoneAddress getPhone() {
		return phone;
	}

	public void setPhone(PhoneAddress phone) {
		this.phone = phone;
	}

	public User(){};
	
	
	public User(UserName username, String password, PhoneAddress phone) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	

}
