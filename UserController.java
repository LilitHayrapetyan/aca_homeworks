package my_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class UserController {

	public String str;

	User user = new User();
    User newUser =new User();
	
	String FILE_DIR = "/Users/lilitha/projects/aca_homeworks/config.properties";
	String command = "start";

	String telNumber;
	Scanner sc = new Scanner(System.in);
	UserRepository userRepo = new UserRepository();
	Properties prop = new Properties();
	String lockAccount = prop.getProperty("lockAccount");
	public static int counter = 0;
    List<User> userList =new ArrayList();
	private String userName;

	private String passwd;

	public void startMethod() {
		try {
			FileInputStream input = new FileInputStream(FILE_DIR);
			prop.load(input);
			System.out.println(prop.getProperty("writeSignInOrSignUp"));
			command = sc.nextLine();
			while (command != "Exit" || invalidCommandCounter() != 3) {

				switch (command) {

				case ("Sign In"):
					signIn();
					break;
				case ("Sign Up"):
					signUp();
					break;
				case ("Sign Out"):
					signInOrSignUp();
					break;
				case ("Add Tel. Numbers"):
				//	addTelNum();
					break;
				case ("Show Tel. Numbers"):
					showTelNumber(); // friends tel numbers also
					break;
				case ("Help"):
		//			help();
					break;
					// case("Add Friend"): addFriend();
			//		break;
				case ("Delete Friend"):
					deleteFriend();
					break;
				case ("Show my friend list"):
					showMyFriendList();
					break;
				default:
					invalidCommandCounter();
					System.out.println(prop.getProperty("invalidCommand"));
					System.out.println("or " + prop.getProperty("invalidUserNameOrPasswd"));
					// check if 3 times are not written invalid commands

				}
				command = sc.nextLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Correct method
	public int invalidCommandCounter() {

		if (!prop.contains(command)) {

			return counter++;
		}
		return counter = counter;
	}

	/*public void userNamePassword(){
		System.out.println(prop.getProperty("provideYourUserName"));
		userName = sc.nextLine();
		user.setUserName(userName);
		System.out.println(prop.getProperty("provideYourPassword"));
		passwd = sc.nextLine();
		user.setPassword(passwd);
		
		
	}
	*/
	public boolean userListContainUserOrNot(List<User> userList, User usr){
		this.userList = userList;
		this.user = usr;
		for(User tmpUser : userList){
			if(tmpUser.equals(usr)){
				return true;
			}
		}
		return false;
	}
	public void signIn(){
		boolean var = false;
	//	User user = new User();
		System.out.println(prop.getProperty("provideYourUserName"));
		userName = sc.nextLine();
		user.setUserName(userName);
		System.out.println(prop.getProperty("provideYourPassword"));
		passwd = sc.nextLine();
		user.setPassword(passwd);
		for(User tmpUser : userList){
			if(tmpUser.equals(user)){
				var = true;
			    newUser =user;
			    break;
			}
		}
		if(var){
			System.out.println(prop.get("succesfullyLoggedIn"));
			System.out.println(prop.getProperty("addTelNumberOrShowTelNumbers"));
			command = sc.nextLine();
			
		}else if (counter < 3) {
            System.out.println(prop.getProperty("invalidUserNameOrPasswd"));
            counter++;
            signIn();
        } else {
            System.out.println(prop.getProperty("lockAccount"));
            System.exit(0);
        }
	}
	
	public void signUp() throws IOException {
		User newUser = new User();
		System.out.println(prop.getProperty("provideYourUserName"));
		userName = sc.nextLine();
		newUser.setUserName(userName);
		System.out.println(prop.getProperty("provideYourPassword"));
		passwd = sc.nextLine();
		newUser.setPassword(passwd);
		newUser.setUserName(user.getUserName());
		if(userListContainUserOrNot(userList,newUser)){
			System.out.println("userNameExists");
		}else
		{			
			userList.add(newUser);
			userRepo.addUser(newUser);
		}
	}
	public void showTelNumber() {
		for(PhoneAddress addr: user.phoneAddressList){
            System.out.println(addr.getNumber());
        }
}

	private void signInOrSignUp() {
		// TODO Auto-generated method stub

	}
		
	public void addTelNum() {
		System.out.println("provideYourTelNumber");
		String tempNum = sc.nextLine();
		user.phoneAddressList.add(new PhoneAddress(tempNum));
		System.out.println("successCreatedNewUserWriteSignInOrSignUp");
	}

	
	
	
/*	public void newTelNumber() {
		mess.getMessage("Now.you.can.write.down.one.of.this.commands." + addTelN + ". or." + shTelN + "'");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		if (str == help) {
			Help();
		} else if (str == addTelN) {
			addTelNum(addTelN);
			mess.getMessage("If.you.want.to.add.one.more.please.write." + addTelN
					+ ".If.you.want.to.see.your.numbers.list.please.write." + shTelN + "'");
			String addNewNum = sc.nextLine();
			if (addNewNum == addTelN) {
				addTelNum(addTelN);
			} else if (addNewNum == shTelN) {
				// show all tel numbers
				showTelNumber();
			} else if (addNewNum == help) {
				Help();
			}
		} else if (str == shTelN) {
			showTelNumber();
		}
		//
	}
*/
	public void telNumberChecker(String addTelN) {
		if (addTelN.length() < 12 || addTelN.length() > 14 || addTelN.contains(("[a-zA-Z+]"))) {
			
			
			
		}
	}

	public void userNameChecker() {
		// check username

	}

	public void passwordChecker() {
		// password checker
	}

	public void signOut() {
		counter=0;
		startMethod();
	
	}

	public void help() {

		

	}

	public void addFriend(User user) {
		
		/*
		
		mess.getMessage("Please.provide.your.friend.username");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		// PhoneType phone = PhoneType.valueOf(str);

		mess.getMessage("Thank.you. Now.Garnik.can.has.access.to.your.address.book");
*/
	}

	private void deleteFriend() {
		// TODO Auto-generated method stub

	}

	private void showMyFriendList() {
		// TODO Auto-generated method stub

	}

}
