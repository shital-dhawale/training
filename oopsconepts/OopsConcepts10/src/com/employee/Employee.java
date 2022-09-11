package com.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//WAP to print the object of Employee class with the help of toString method. 
//Employee class fields :- empid, empname, empsalary, empaddress, emp_dob, emp_doj. 
//use Date class to store the date of birth(dob) 
//and date of joining(doj).
public class Employee {
	int empid;
	String empname;
	int empsalary;
	String empaddress;
	String emp_dob;
	String emp_doj;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(String emp_dob) {
		this.emp_dob = emp_dob;
	}
	public String getEmp_doj() {
		return emp_doj;
	}
	public void setEmp_doj(String emp_doj) {
		this.emp_doj = emp_doj;
	}
	
	public Employee(int empid, String empname, int empsalary, String empaddress, String emp_dob, String emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter id ");
		int empid = sc.nextInt();
		System.out.println("Please enter name ");
		String empname = sc.next();
		System.out.println("Please enter salary ");
		int empsalary = sc.nextInt();
		System.out.println("Please enter address ");
		String empaddress = sc.next();
		System.out.println("Please enter Date of Birth ");
		String emp_dob = sc.next();
		Date enteredDOB = new SimpleDateFormat("dd/MM/yy").parse(emp_dob);
		System.out.println("Please enter date of joining ");
		String emp_doj = sc.next();
		Date enteredDOJ = new SimpleDateFormat("dd/MM/yy").parse(emp_doj);
		Employee employee = new Employee(empid, empname, empsalary, empaddress, emp_dob, emp_doj);
		System.out.println(employee);
	}
	

}
