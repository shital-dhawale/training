package com.collection1_9;

public class Employee {
	int empId;
	 String empName;
	 int salary;
	 String deptName;
	 String address;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int empId, String empName, int salary, String deptName, String address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.deptName = deptName;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", deptName=" + deptName
				+ ", address=" + address + "]";
	}
	 
}
