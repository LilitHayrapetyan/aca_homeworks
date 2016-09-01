package my_project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class WriteCommandsInConfigPropertiesFile {

	public void addCommand() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		// OutputStream output = null;

		String configFile = "/Users/lilitha/projects/aca_homeworks/resources/config.properties";
		OutputStream output = new FileOutputStream(configFile);
		// set the properties value
		prop.setProperty("signIn", "Sign In");
		prop.setProperty("signUp", "Sign Up");
		prop.setProperty("signOut", "Sign Out");
		prop.setProperty("userName", "UserName");
		prop.setProperty("password", "Password");
		prop.setProperty("writeSignInOrSignUp",
				"Please write down one of this commands \"Sign In\" or \"Sign Up\".");
		prop.setProperty("provideYourUserName", "Please provide your username:");
		prop.setProperty("provideYourPassword", "Please provide your password:");
		prop.setProperty("successCreatedNewUserWriteSignInOrSignUp",
				"You have successfully created user. Please write down one of this commands \"Sign In\" or \"Sign Up\".");
		prop.setProperty("succesfullyLoggedIn", "You are successfully logged in");
		
		prop.setProperty("addTelNumberOrShowTelNumbers",
				"Now you can write down one of this commands \"Add Tel. Numb\" or \"Show Tel. Numbers\"'");
		prop.setProperty("addTelNum", "Add Tel. Numb");
		prop.setProperty("showTelNumbers", "Show Tel. Numbers");
		prop.setProperty("provideYourTelNumber", "Please provide your telephone number");
		prop.setProperty("successfullyAddedNumber", "You have successfully added your number. ");
		prop.setProperty("addOneMoreTelNumber", "If you want to add one more please write \"Add Tel. Numb\". ");
		prop.setProperty("seeTelephoneNumbersList",
				" If you want to see your numbers list please write \"Show Tel. Numbers\"'");
		
		prop.setProperty("incorrectUserNameOrPasswd", "Your username or password is incorrect please try again");
		prop.setProperty("invalidCommandHelp", "Invalid command. Please write \"Help\" command for see command list");

		prop.setProperty("addFriend", "Please provide your friend username");
		prop.setProperty("yourFriendHasAccessPhonebook",
				"Thank you. Now your friend can has access to your address book");
		prop.setProperty("delFriend", "Delete Friend");
		prop.setProperty("yourFriendUserName", "Please provide your friend username");
		prop.setProperty("notFriends", "Thank you. Now Garnik and you are not friends. ");
		prop.setProperty("notFriend", "Sorry. You don't have friend with '---Garnik' name.");
		prop.setProperty("showFriendsList", "Show my friend list");
		prop.setProperty("bellowfriendsList", "Your friends list you can see below");

		prop.setProperty("invalidCommand", "You have written Invalid Command");
		prop.setProperty("invalidUserNameOrPasswd",
				"You have written Invalid Username or Password. Please correct it.");
		prop.setProperty("lockAccount", "Your Account has been locked.");

		prop.setProperty("userNameExists", "Please write down another username");
		 Enumeration<Object> a = prop.keys();

		// save properties to project root folder
//Help command is not define
	//	prop.setProperty("Help", a);
		prop.store(output, null);
	}
}
