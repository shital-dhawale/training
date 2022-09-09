package com.training;
//10.	You are having array of strings. Now you have to arrange strings in 
//array on the basis of the length of each string. 
//Smallest string will be first and so on. 
public class Array1_10 {
	public static void main(String[] args) {
		String arr[]= {"shital", "rupesh", "kajal", "meenakshi", "nishigandha"};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].length()>arr[j].length()) {
					String temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		
		}
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		}
	
	}
	
	
	}
