package com.exception1_10;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int arr1[] = {1, 3, 2, 6, 4, 9};
		Parent p = new Parent();
		//Parent p1 = new Child();
		Child c1 = new Child();
		System.out.println("Choice 1 : Find maximum in array");
		System.out.println("Choice 2 : Find average and maximum of the array ");
		Scanner sc = new Scanner(System.in);
		int input  = sc.nextInt();
		switch(input) {
		case 1 :
			p.CalculateMaxFromArray(arr1);
			break;
		case 2 :
			c1.CalculateMaxFromArray(arr1);
			break;
		}
	}
}
