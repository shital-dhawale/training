package com.training;
//2.	WAP to find duplicate numbers and there counting from list of numbers.
public class Array1_2 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 12, 1, 3, 4, 11, 12, 2};
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					System.out.println("Duplicate no : " +arr[i]);
				}
			}
		}
		System.out.println("Count of duplicates : " +count);
	}
}
