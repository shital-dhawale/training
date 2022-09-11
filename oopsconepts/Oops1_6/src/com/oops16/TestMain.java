package com.oops16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		FindMaxImpl findMaxImpl = new FindMaxImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.println("Choice 1 : Find maximun from three number");
		System.out.println("Choice 2 : Find maximun from four number");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			System.out.println("Enter three numbers to find maximum");
			int arr[] = new int[10];
			for(int i=0; i<3; i++) {
				arr[i]=sc.nextInt();
			}
			findMaxImpl.getMaxFromGivenThreeNumbers(arr);
			break;
			
		case 2 : 	
			System.out.println("Enter four numbers to find maximum");
			int arr1[] = new int[10];
			for(int i=0; i<4; i++) {
				arr1[i]=sc.nextInt();
			}
			findMaxImpl.getMaxFromGivenFourNumbers(arr1);
			break;
		}
	}
}
