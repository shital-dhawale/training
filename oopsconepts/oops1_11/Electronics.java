package com.oops1_11.electronics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Electronics {
		int id;
		String semiconductorType;

	public static void getElectronicsDetails() throws ParseException {
		int id;
		String semiconductorType;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter id : ");
		id = sc.nextInt();
		System.out.println("You entered id : " +id);
		System.out.println("Please enter semiconductor type");
		semiconductorType = sc.next();
		System.out.println("You entered semiconductor type : " +semiconductorType);
		System.out.println("Please enter date");
		String sDate1= sc.next();
		Date date1 = new SimpleDateFormat("dd/MM/yy").parse(sDate1);
		System.out.println("Youn entered date : " +date1);
	
	}


	
	
	
}
