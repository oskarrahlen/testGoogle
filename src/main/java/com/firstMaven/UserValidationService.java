package com.firstMaven;

public class UserValidationService {

	public boolean isUserValid(String user, String password){
		if(user.equals("oskar") && password.equals("fet")){
			return true;
		}
		return false;
	}
}
