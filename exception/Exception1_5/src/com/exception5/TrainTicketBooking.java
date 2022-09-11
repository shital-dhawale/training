package com.exception5;

import java.util.Date;
import java.util.Scanner;

//5) A user try to book the ticket in the railway system. A user can only book 
//6 ticket at a time in case of normal booking and 4 ticket at the time of 
//tatkal booking. Tatkal booking is only allowed to be done in between 10 to 12. 
//When he choose to book ticket in tatkal he is only allowed to book 4 tickets. 
//You are suppose to perform following task during 10 to 12 only tatkal tickets 
//can be booked it means only four ticket can be booked for tatkal if user try to 
//book the more than 4 ticket in tatkal you have to throw the exception 
//booking limit exceed. During 11:00 PM to 1:00 AM user is not allowed to book 
//any ticket if he try to book the ticket during this duration 
//BookingNotAllowedException should be thrown. User can book normal ticket whole day 
//except the time duration 11:00 PM to 1:00 AM. If user try to book more than 6 tickets. 
//NormalTicketBookingException should be thrown. Ticket for age limit 0 year to 5 is 
//not allowed if user try to book the ticket for the same age group Exception should 
//be thrown.
public class TrainTicketBooking {
	public static void getTrainTicketBookingDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your chioce ");
		System.out.println("1 : Normal Ticket Booking ");
		System.out.println("2 : Tatkal Ticket Booking ");
		int input = sc.nextInt();
		Date date = new Date();
		switch(input) {
		case 1 : 
			System.out.println("Normal Ticket Booking ");
			System.out.println("Enter your name ");
			String name = sc.next();
			int time = date.getHours();
			System.out.println("Enter number of tickets that you want to book");
			int noOfTickets = sc.nextInt();
			System.out.println("Enter age group starting from year ");
			int ageGroupStartingFromYear = sc.nextInt();
			if (time>=23 && time<1){
				if(noOfTickets<=6) {
					if(ageGroupStartingFromYear>5) {
						System.out.println("Your train tickets are booked and following are the details ");
						System.out.println("Your name  : " +name);
						System.out.println("Number of tickets booked : " +noOfTickets);
					}else {
						throw new AgeGroupException("Sorry this age group i.e. 0-5 is not allowed");
					}
				}else {
					throw new NormalTicketBookingException("Normal ticket booking limit exceeded, normal ticket booking limit is 6");
				}
			}else {
				
				throw new BookingNotAllowedException("Currently bookings closed, bookings are allowed in between 1am to 11pm");
			}
			
			break;
		case 2 : 
			System.out.println("Tatkal Ticket Booking ");
			System.out.println("Enter your name ");
			String name1 = sc.next();
			int time1 = date.getHours();
			System.out.println("Enter number of tickets that you want to book");
			int noOfTickets1 = sc.nextInt();
			System.out.println("Enter age group starting from year ");
			int ageGroupStartingFromYear1 = sc.nextInt();
			if(time1<10 && time1>12) {
				if(noOfTickets1<=4) {
					if(ageGroupStartingFromYear1>5) {
						System.out.println("Your train tickets are booked and following are the details ");
						System.out.println("Your name  : " +name1);
						System.out.println("Number of tickets booked : " +noOfTickets1);
					}else {
						throw new AgeGroupException("Sorry this age group i.e. 0-5 is not allowed");
					}
				}else {
					throw new NormalTicketBookingException("Normal ticket booking limit exceeded, normal ticket booking limit is 4");
					
				}
			}else {
				throw new BookingNotAllowedException("Currently bookings closed, bookings are allowed in between 12am to 10pm");
			}
			break;
		}
	}
}
