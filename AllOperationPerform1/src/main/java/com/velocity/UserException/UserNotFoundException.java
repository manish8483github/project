package com.velocity.UserException;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
		super(message); // calling the super class constructor
		System.out.println("inside USernot found parameter" + message);

	}

}
