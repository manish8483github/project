package com.velocity.UserException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice 
public class UserHandlerException {
	
	@ExceptionHandler(value = {UserNotFoundException.class})
 public ResponseEntity<Object> handleUser(UserNotFoundException userNotFoundException) {
	 
	 UserException userException=new UserException(userNotFoundException.getMessage());
	 
	return new ResponseEntity<>(userException,HttpStatus.NOT_FOUND);
	 
	 
 }
}
