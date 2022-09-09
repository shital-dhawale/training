package com.training;
//1.	WAP to find third maximum number from list of numbers
public class Array1_1 {
	public static void main(String[] args) {
		int arr[] = {12, 3, 5, 10, 6, 11};
		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("third maximum value : " +arr[2]);
	}
}
