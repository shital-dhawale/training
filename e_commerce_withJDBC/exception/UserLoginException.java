package com.e_commerce.exception;

public class UserLoginException extends RuntimeException{
	public UserLoginException(String messege) {
		super(messege);
	}
}
