package com.yash.tdd.basic1;

public class ConsecutiveNoEx {

	int consecutiveNumsSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		ConsecutiveNoEx cne = new ConsecutiveNoEx();

		int s = cne.consecutiveNumsSum(10);
		System.out.println(s);

	}
}
