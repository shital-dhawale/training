package com.oops1_1;
//date_of_registration, delivery_address, 
//contactno, email_id
public class Customer extends Person {
	private String date_of_registration;
	private String delivery_address;
	private String contactNo;
	private String email_id;
	public String getDate_of_registration() {
		return date_of_registration;
	}
	public void setDate_of_registration(String date_of_registration) {
		this.date_of_registration = date_of_registration;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public static void main(String[] args) {
		Customer customer = new Customer();
	}
	
}
