package com.training;
//WAP to print the number of alphabets repeated in the given string.
public class String1_4 {
	public static void main(String[] args) {
		String str = "nayan";
		int count = 0;
		char arr[] = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicates are : " +arr[j]);
					count++;
				}
			}
		}
		System.out.println("Count of duplicates : " +count);
	}

}
