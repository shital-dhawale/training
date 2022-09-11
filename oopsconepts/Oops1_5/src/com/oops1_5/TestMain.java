package com.oops1_5;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		D d = new D();
		d.sum(input1, input2);
		d.sub(input1, input2);
		d.mul(input1, input2);
		d.div(input1, input2);
	}
	
}
