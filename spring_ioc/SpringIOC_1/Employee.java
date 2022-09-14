package com.springioc_1;

public class Employee {
	private int empId;
	private String empName;
	private String empRole;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public Employee(int empId, String empName, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
