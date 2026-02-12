package com.Capgemini.UserLoginValidation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserLoginValidationTesting {
	
	@Test
	void validUsernameTest() {
		assertTrue(UserLoginValidation.checkingUserName("Vivek123"));
	}
	
	@Test
	void validUsernameWithSpecialCharacter() {
		assertFalse(UserLoginValidation.checkingUserName("Vivek@123"));
	}
	
	@Test
	void validUsernameShortForm() {
		assertFalse(UserLoginValidation.checkingUserName("Viv3"));
	}
	
	@Test
	void validUsernameEmpty() {
		assertFalse(UserLoginValidation.checkingUserName(""));
	}
	
	@Test
	void validUsernameNull() {
		assertFalse(UserLoginValidation.checkingUserName(null));
	}
	
	
	@Test
	void validPasswordTest() {
		assertFalse(UserLoginValidation.checkingPassword("Vivek123"));
	}
	
	@Test
	void validPasswordWithSpecialCharacter() {
		assertTrue(UserLoginValidation.checkingPassword("Vivek@123"));
	}
	
	@Test
	void validPasswordShortForm() {
		assertFalse(UserLoginValidation.checkingPassword("Viv3"));
	}
	
	@Test
	void validPasswordEmpty() {
		assertFalse(UserLoginValidation.checkingPassword(""));
	}
	
	@Test
	void validPasswordNull() {
		assertFalse(UserLoginValidation.checkingPassword(null));
	}


}
