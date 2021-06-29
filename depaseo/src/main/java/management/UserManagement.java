package management;

import java.util.ArrayList;
import java.util.Scanner;


import model.User;
import utils.UserUtils;

public class UserManagement {
	
	public static void createUser(Scanner reader, ArrayList<User> users) {
		
		User newUser = new User();
		
		System.out.println(language.getMessage().get("tellName"));
		newUser.setName(reader.next());

		System.out.println(language.getMessage().get("tellSurname"));
		newUser.setSurname(reader.next());

		//creating Username from Name.
		newUser.setUserName(newUser.getName());
		
		//creating Email from Name and Surname.		
		newUser.setEmail(UserUtils.createEmail(newUser.getName(), newUser.getSurname()));
		
		//creating Password.		
		newUser.setPassword(UserUtils.createPassword());
		
		System.out.println("Password: "  + newUser.getPassword());
		//adding newUser to our array.		
		users.add(newUser);

	}

	public static void deleteUser() {

		// to-do
	}

	public static void updateUser() {

		// to-do
	}
	
	public static void listUsers() {

		// to-do
	}


}