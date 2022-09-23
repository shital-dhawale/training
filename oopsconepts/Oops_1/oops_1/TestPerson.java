package com.oops_1;

public class TestPerson {
	public static void main(String[] args) {

		Employee employee = new Employee(111, "shital", " Pune", "05/01/1995", 1000, "27/02/2022", "hinjewadi",
				"development", "9999999999", "shital.dhawale@gmail.com");

		Customer customer = new Customer(333, "Kajal", "Ahmednagar", "17/09/1996", "12/7/2022", "Pune", "123456677",
				"kajal.khule@gmail.com");

		System.out.println(employee);
		System.out.println(customer);

	}
}
