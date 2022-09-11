package com.exception1_9;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		int satisfiedCollarCount = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter actual size of collar : ");
		int actualCollarSize = scanner.nextInt();
		System.out.println("Enter 10 collar sizes to check ");
		for(int i=0; i<10; i++) {
			double collarSizetoCheck = scanner.nextDouble();
			if(collarSizetoCheck<=((0.02*actualCollarSize)+actualCollarSize)) {
				satisfiedCollarCount++;
			}
		}
		if(satisfiedCollarCount<5){
			throw new CollarStandardDeviateException("Sizes are not acceptable, these sizes are rejected ");
		}else {
			System.out.println("Collar sizes are accepted");
		}
		
	}
	




}
