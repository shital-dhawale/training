package com.oops16;

public class FindMaxImpl implements FindMax{

	@Override
	public void getMaxFromGivenThreeNumbers(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int max = arr.length-1;
		System.out.println("Maximum is : " +arr[max]);
		
		
	}

	@Override
	public void getMaxFromGivenFourNumbers(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int max = arr.length-1;
		System.out.println("Maximum is : " +arr[max]);
		
		
	}



}
