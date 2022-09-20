package com.ecommerce.exception;

public class UserLoginException extends RuntimeException{
	public UserLoginException(String messege) {
		super(messege);
	}
}
