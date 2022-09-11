package com.exception1_8;

import java.util.Scanner;

public class Exception1_8Main {
	public static void main(String[] args) {
		int countCapitalLetters = 0;
		int countSmallLetters = 0;
		int countIntegers = 0;
		int countSpecialCharacters = 0;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter your password to check whether it is strong or not ");
		String password  = scanner.next();
		if(password.length()<8 || password.length()>14) {
			throw new PasswordFormatException("Password is weak ");
		}else {
			for(int i=0; i<password.length(); i++) {
				char ch = password.charAt(i);
				if(ch>='A' && ch<='Z') {
					countCapitalLetters++;
				}else if(ch>='a' && ch<='z') {
					countSmallLetters++;
				}else if(ch>='0' && ch<=10) {
					countIntegers++;
				}else {
					countSpecialCharacters++;
				}
			}
			if(countCapitalLetters<2 && countSmallLetters<2 && countIntegers<2 && countSpecialCharacters<2) {
				throw new PasswordFormatException("Password is weak ");
			}else {
				System.out.println("Password is strong");
			}
		}
	}
}
