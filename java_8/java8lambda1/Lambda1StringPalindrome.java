package com.java8lambda1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda1StringPalindrome {
	public static boolean checkPalindromeNumber(int num) {
		String temp = Integer.toString(num);
		boolean value = IntStream.range(0, temp.length()/2).noneMatch(i->temp.charAt(i)!=temp.charAt(temp.length()-i-1));
		return value;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is palindrome or not");
		int number = scanner.nextInt();
		if(checkPalindromeNumber(number)){
		System.out.println("Palindrome");	
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
