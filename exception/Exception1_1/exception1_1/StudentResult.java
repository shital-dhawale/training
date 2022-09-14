package com.exception1_1;

import java.util.Scanner;

public class StudentResult {
	public static void getStudentResultDetails() {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks for below subjects : ");
		System.out.println("English : " );
		int subject1  = sc.nextInt();
		System.out.println("MAths : ");
		int subject2 = sc.nextInt();
		System.out.println("Science : ");
		int subject3 = sc.nextInt();
		System.out.println("Social Science : ");
		int subject4 = sc.nextInt();
		System.out.println("Marathi : ");
		int subject5 = sc.nextInt();
		double total = subject1+subject2+subject3+subject4+subject5;
		double averagepercent = (total/500);
		if(subject1<0||subject2<0||subject3<0||subject4<0||subject5<0) {
			throw new ResultException("Invalid marks ");
		}
		
		if((averagepercent*100)<=40) {
			throw new ResultException("Fail");
		}else {
			throw new ResultException("Pass");
		}
	}
}
