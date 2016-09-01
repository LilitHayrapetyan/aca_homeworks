package my_project;

import java.io.IOException;

public class UserDemo {

	public static void main(String[] args) {
		
		WriteCommandsInConfigPropertiesFile a = new WriteCommandsInConfigPropertiesFile();
		try {
			a.addCommand();
		} catch (IOException e) {
			e.printStackTrace();
		}

		UserController control = new UserController();
		control.startMethod();
	}
	
}
