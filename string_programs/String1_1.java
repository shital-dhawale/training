package com.training;
//Create a program in which two string is input by the user and after that 
//user will enter index in first string where we want to insert the 
//second string and insert the second string at that index and create a new string
public class String1_1 {
	public static void main(String[] args) {
		String str = "shitaldhawale";
		String str1 = "dattatray";
		String s = new String();
		int index = 5;
		for(int i=0; i<str.length(); i++) {
			s = s + str.charAt(i);
			if(i==index) {
				s = s + str1;
			}
			
		}
		System.out.println(s);
	}

}
