package com.training;
//An Array Contain different numbers you have to find how many are 
//even, odd, perfect and prime
public class Array1_5 {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7,8,9,10};
		int evenCount=0;
		int oddCount=0;
		int perfectCount=0;
		int primeCount=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evenCount++;
				
			}else {
				oddCount++;
			}
		}
//		for(int j=0; j<arr.length; j++) {
//			int num = arr[j];
//		for(int k=2; k<=num; k++) {
//			if(num%k==0) {
//				primeCount++;
//			}
//			
//		}
//		}
		for(int j=0; j<arr.length;j++) {
			if(arr[j]%2!=0) {
				primeCount++;
			}
		}
		for(int l=0; l<arr.length; l++) {
			int number=arr[l];
			for(int m=1;m<number; m++) {
				if(number%m==0) {
					
				}
			}
			
		}
		for(int n=0; n<arr.length; n++) {
			int sum = 0;
			int number1=arr[n];
			for(int o=1; o<=(arr[n])/2; o++) {
				if(number1%o==0) {
					sum = sum+o;
				}
			}
			if(number1==sum) {
				perfectCount++;
			}
		}
		System.out.println("Even count is : " +evenCount);
		System.out.println("Odd count is " +oddCount);
		System.out.println("Perfect count is :" +perfectCount);
		System.out.println("Prime count is : " +primeCount);
		
	}

}
