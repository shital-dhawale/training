package com.exception1_10;

public class Child extends Parent{
	public static void CalculateMaxFromArray(int arr[]) throws NumberFormatException,NullPointerException{
		int sum=0;
		double average=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//sum=sum+arr[i];
				}
			}
			
		}
		for(int k=0; k<arr.length; k++) {
			sum=sum+arr[k];
		}
		average = sum/arr.length;
		int max = arr.length-1;
		System.out.println("Average is : " +average);
		System.out.println("Maximun is : " +arr[max]);
	}
}
