package com.oops1_7;

import java.util.Arrays;
import java.util.Scanner;

public class StringCompareImpl implements StringCompare{

	@Override
	public boolean compareStrings(char[] arr1, char[] arr2) {
		if(arr1.length!=arr2.length) {
			return false;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0; i<arr1.length; i++){
			if(arr1[i]==arr2[i]) {
				return true;
			}else {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		StringCompareImpl stringCompareImpl = new StringCompareImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String input1 = sc.next();
		System.out.println("Enter second string : ");
		String input2 = sc.next();
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		if(stringCompareImpl.compareStrings(arr1, arr2)) {
			System.out.println("Both Strings are same ");
		}else {
			System.out.println("Both strings are different ");
		}
	}

}
