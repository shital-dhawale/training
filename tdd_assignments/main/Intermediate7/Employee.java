package com.yash.tdd.Intermediate7;

public class Employee {
	private int emp_ID;
	private String emp_Name;
	private String emp_Designation;
	public int getEmp_ID() {
		return emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Designation() {
		return emp_Designation;
	}
	public void setEmp_Designation(String emp_Designation) {
		this.emp_Designation = emp_Designation;
	}
	public Employee(int emp_ID, String emp_Name, String emp_Designation) {
		super();
		this.emp_ID = emp_ID;
		this.emp_Name = emp_Name;
		this.emp_Designation = emp_Designation;
	}
	@Override
	public String toString() {
		return "Employee [emp_ID=" + emp_ID + ", emp_Name=" + emp_Name + ", emp_Designation=" + emp_Designation + "]";
	}
	
	
	
	
	

}
