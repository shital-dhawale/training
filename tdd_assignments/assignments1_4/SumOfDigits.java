package com.tdd.assignments1_4;

public class SumOfDigits {
	public static int getSumOfDigitsFromGivenString(String str) {
		String arr[] = str.split("\\+");
		//System.out.println(arr[]);
	
		int sumOfDigits=0;
		for(int i=0; i<arr.length; i++) {
			int digit = Integer.parseInt(arr[i]);
			sumOfDigits = sumOfDigits + digit;
		}
		return sumOfDigits;
	}
	
	
}
