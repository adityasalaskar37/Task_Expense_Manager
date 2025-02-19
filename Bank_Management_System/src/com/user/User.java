package com.user;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
	private String password;
	
	private static List<User> userList = new ArrayList<User>();
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public static boolean registerUser(String username, String password) {
		for(User user: userList) {
			if(user.getUsername().equals(username)){
				return false;
			}
		}
		User newUser = new User(username, password);
		userList.add(newUser);
		return true;
	}
	public static User loginUser(String username, String password) {
		for(User user: userList) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}
