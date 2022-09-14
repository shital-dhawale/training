package com.exception1_1;
//WAP to take student marks of different subject in class StudentResult 
//which is associated with Student class in following way:- 
//Class Student { Int rollno; String sname; String saddress; StudentResult srobj; 
//Setter and getter for all class variable. } Create your own Exception class 
//with name ResultException. This exception will be thrown when 
//user is failed in more than 1 subject. You also need to throw exception 
//when user mistakenly input the negative marks. 
//If user total score is less than 40% you need to through fail exception
public class Student {
	int rollNo;
	String sName;
	String Address;
	StudentResult studentResult;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public StudentResult getStudentResult() {
		return studentResult;
	}
	public void setStudentResult(StudentResult studentResult) {
		this.studentResult = studentResult;
	}
	
}
