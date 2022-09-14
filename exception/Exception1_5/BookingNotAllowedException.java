package com.exception5;

public class BookingNotAllowedException extends RuntimeException{
	public BookingNotAllowedException(String messege) {
		super(messege);
	}

}
