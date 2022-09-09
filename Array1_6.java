package com.training;
//6.	Suppose that you are having an array of size N. now your task is to sort the 
//half array that is from 0 to N/2 in ascending order and N/2+1 to N in 
//descending order
public class Array1_6 {
	public static void main(String[] args) {
		int a[] = { 1, 4, 9, 7, 5, 3, 8, 10};
		for (int i = (a.length / 2); i >= 0; i--) {
			for (int j = (a.length / 2); j >= 0; j--) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = (a.length / 2) + 1; i < a.length - 1; i++) {
			for (int j = (a.length / 2) + 2; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}
}

					




	
