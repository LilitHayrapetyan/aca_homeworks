package my_project;

import java.io.IOException;

public interface UserRepoInterface {

	public void addUser(User user) throws IOException;
	//public void editUser(User user);
	public void deleteUser(User user);
	public User getUser(User user) throws IOException, ClassNotFoundException;
	void editUser(User user, UserName userName, String password, PhoneAddress phone) throws IOException;
	
	  
}
