package com.Capgemini.UserLoginValidation;

public class UserLoginValidation {
	
	//UserName Testing
	public static boolean checkingUserName(String userName) {
		if(userName == null || userName.isEmpty() ) {
			return false;
		}
		
		if(userName.length() < 5 || userName.length() > 15 ) {
			return false;
		}
		
		if(!userName.matches("[A-Za-z0-9]+")) {
			return false;
		}
		return true; 
	}
	
	//Password Testing
	public static boolean checkingPassword(String password) {
		if(password == null || password.isEmpty()) {
			return false;
		}
		
		if(password.length() < 8) {
			return false;
		}
		
		if(!password.matches(".*[A-Za-z0-9].*")) {
			return false;
		}
		
		if(!password.matches(".*[@$!%*?&#].*")) {
			return false;
		}
		return true;
	}

}

class UserDetails {
	private String userName;
	private String password;
	
	UserDetails(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
