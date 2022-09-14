package com.exception1_10;

public class Parent {
	public static void CalculateMaxFromArray(int arr[]) throws NullPointerException,ArrayIndexOutOfBoundsException{
		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		int max = arr.length-1;
		System.out.println("Maximum is : " +arr[max]);
	}
}
