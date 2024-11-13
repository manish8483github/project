package com.velocity.UserException;

public class UserException {

	private final String message;

	public UserException(String message) {
		
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
