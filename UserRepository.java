package my_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class UserRepository implements UserRepoInterface{

	String userName;
	private String password;
	List<PhoneAddress> phoneAddressList;
	List<User> friends;
	User user = new User(userName, password, phoneAddressList, friends);
	static int counter = 0;
	User user1;
	
	private User result;
	
	@Override
	public void addUser(User user) throws IOException{
		user.userId = counter++;
		user.setPhoneId(user.userId);
		String userfilename= "/Users/lilitha/projects/aca_homeworks/UserList.scv";
		 
		FileOutputStream fos = new FileOutputStream(userfilename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.close();
		System.out.println(" User added in file");
		
		String phoneAddressFilename= "/Users/lilitha/projects/aca_homeworks/phoneAddressFilename.scv";
		 
		FileOutputStream fos1 = new FileOutputStream(phoneAddressFilename);
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(user.phoneAddress);
		oos1.close();
		
	}

	@Override
	public void editUser(User user, int userId) throws IOException{
		
	/*	String filename= "MyFile.ser";
		FileOutputStream fos = new FileOutputStream(filename);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
		
	    
	    oos.writeObject(user);
		oos.close();
		
	
*/
	}
	@Override
	public void deleteUser(User user) throws IOException{
		
		
	}

	@Override
	public User getUser(User user) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("MyFile.ser");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    result = (User) ois.readObject();
	    ois.close();
		return result;
	}
	

}
