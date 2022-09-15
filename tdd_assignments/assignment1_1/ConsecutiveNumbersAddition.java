package com.tdd.assignment1_1;

public class ConsecutiveNumbersAddition {
	public static int add() {
		int consecutiveSum = 0;
		for(int i=1; i<=10; i++) {
			consecutiveSum = consecutiveSum+i;
		}
		return consecutiveSum;
	}
}
