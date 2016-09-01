package my_project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable{

	private String userName;
	private String password;
	private PhoneType phoneType;
	private String number;
	private int phoneId;
	List<PhoneAddress> phoneAddressList =new  ArrayList<PhoneAddress>();
	List<User> friends =new ArrayList<User>();
	public int userId;
	
	PhoneAddress phoneAddress =new  PhoneAddress(phoneType, number, phoneId);
	
	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public PhoneAddress getPhoneAddress() {
		return phoneAddress;
	}

	public void setPhoneAddress(PhoneAddress phoneAddress) {
		this.phoneAddress = phoneAddress;
	}

	public List<PhoneAddress> getPhoneAddressList() {
		return phoneAddressList;
	}

	public void setPhoneAddressList(PhoneAddress phoneAddress) {
		this.phoneAddressList.add(phoneAddress);
	}

	public User(){};
	
	
/*	public User(String userName, String password, PhoneAddress phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneAddress = phone;
	}
*/	
	public User(String userName, String password, List<PhoneAddress> phoneAddressList, List<User> friends) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneAddressList = phoneAddressList;
		this.friends = friends;
	}

	@Override
	public boolean equals(Object object) {
		boolean result = false;
		if (object == null || object.getClass() != getClass()) {
			result = false;
		} else {
			User user = (User) object;
			if (this.userName != user.userName) {
				result = false;
			}else 
				result=true;
		}
		return result;
	}

	@Override
	public int hashCode() {
		int hash = 1; 
		return hash + this.userName.hashCode();		
	}
	public Boolean CheckUsersId(User user){
		return this.equals(user);
	
	}
}
