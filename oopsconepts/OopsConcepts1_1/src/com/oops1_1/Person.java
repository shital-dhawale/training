package com.oops1_1;
//Create a class Person with following member and setter getter for them. 
//Pid, pname, paddress,dob all are private. Now Person class will be inherit by 
//the Employee class will have following fields salary, date_of_joining, 
//base_location, deptobj, contactno, emailid. Department class will have following 
//member, deptid, and dname. Customer class also inherit the Person class, 
//it also has following fields: -  date_of_registration, delivery_address, 
//contactno, email_id. Setter and getter methods for all class variables 
//should be declared.
//Now you have to create object of Employee class and Customer class. 
//With the help of super keyword initialize the person class data members 
//as they are protected. Create array of object of department class and 
//while creating the object of the Employee class we will pass 
//object of that particular department. 
//Now print all details of the Customer and Employee. 

public class Person {
	private int pId;
	private String pName;
	private String pAddress;
	private String dob;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
