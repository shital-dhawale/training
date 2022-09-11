package com.exception1_1;

public class ResultException extends RuntimeException{
	private String message;
	public ResultException(String messesge) {
		super(messesge);
	}

}
