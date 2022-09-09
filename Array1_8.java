package com.training;
//8.	You are given a sequence of Character in the form of Array. 
//Now you have to put all vowels and consonants together in the array
public class Array1_8 {
	public static void main(String[] args) {
		char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				System.out.println("Vowel : " +arr[i]);
			}else {
				System.out.println("Consonant : " +arr[i]);
			}
		}
		
	}

}
