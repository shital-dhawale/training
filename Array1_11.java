package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//WAP to remove the String which is not palindrome string 
//from the array of String.
public class Array1_11 {
	public static boolean checkPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				return true;
			}else {
				return false;
			}
		}
		i++;
		j--;
		return true;
	}
	public static void main(String[] args) {
	String arr[] = {"mom", "madam", "shital", "abba"};
	System.out.println("Before : ");
	for(int j=0; j<arr.length; j++) {
		System.out.println(arr[j]);
	}
	
		List list = new ArrayList();
		for(int i=0; i<arr.length; i++) {
			if(checkPalindrome(arr[i])) {
				list.add(arr[i]);
			}
		}
		Object[] arr1 = list.toArray();
		System.out.println();
		System.out.println("After : ");
		for(int k=0; k<arr1.length; k++) {
			System.out.println(arr1[k]);
		}
		

}
	
	
	
}
