package com.yash.tdd.basic3;

import java.util.Scanner;

public class CountEvenOddDigit {
	
	public String countevenodd() {
		int ecount =0,ocount=0,totalcount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		long n =sc.nextInt();
		int even_count = 0;
	    int odd_count = 0;
	    while (n > 0)
	    {
	        long rem = n % 10;
	        if (rem % 2 == 0)
	            even_count++;
	        else
	            odd_count++;
	        n = n / 10;
	    }
	    System.out.println ( "Even count : " +
	                              even_count);
	    System.out.println ( "Odd count : " +
	                              odd_count);
	    return even_count+"even digit"+odd_count+"odd_count";
	}
	 

	
public static void main(String[] args) {
	CountEvenOddDigit ceod=new CountEvenOddDigit();
	
	String str=ceod.countevenodd();
	        System.out.println(str) ;
         
    }
//	System.out.println(c +"even digit"+c+"odd digits");
}

