package com.exception1_1;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll number ");
		int rollNo = sc.nextInt();
		Student student = new Student();
		student.setRollNo(rollNo);
		System.out.println("Enter your name ");
		String name = sc.next();
		student.setsName(name);
		System.out.println("Enter your address ");
		String address = sc.next();
		student.setAddress(address);
		StudentResult studentResult = new StudentResult();
		studentResult.getStudentResultDetails();
	}
}
