package com.training;

import java.util.ArrayList;
import java.util.List;

//WAP to remove all the vowels from the given string.
public class String1_3 {
	public static void main(String[] args) {
		String str = "shitaldhawale";
		//char arr[]= str.toCharArray();
		//List list = new ArrayList();
		
		System.out.println("Before : " +str);
		System.out.println("After removing vowels : ");
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u') {
				System.out.print(str.charAt(i));
			}
			
		}
		
		
	}

}
