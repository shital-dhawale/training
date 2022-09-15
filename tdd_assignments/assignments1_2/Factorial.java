package com.tdd.assignments1_2;
//Q2: Write a TDD based app to find out the factorial of given number
public class Factorial {
	public static int getFactorial(int input) {
		int fact=1;
		for(int i=input; i>=1; i--) {
			fact=fact*i;
		}
		return fact;
	}
}
