package my_project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserRepository implements UserRepoInterface{

	UserName userName;
	private String password;
	PhoneAddress phone;
	User user = new User(userName, password, phone);
	private User result;
	
	@Override
	public void addUser(User user) throws IOException{
		 String filename= "MyFile.ser";
		 FileOutputStream fos = new FileOutputStream(filename);
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 oos.writeObject(user);
		 oos.close();
		 System.out.println(" User added in file");
	}

	@Override
	public void editUser(User user, UserName userName, String password, PhoneAddress phone) throws IOException{
		
		String filename= "MyFile.ser";
		FileOutputStream fos = new FileOutputStream(filename);
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
		
	    
	    oos.writeObject(user);
		oos.close();
		
	}

	@Override
	public void deleteUser(User user) {
		
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
