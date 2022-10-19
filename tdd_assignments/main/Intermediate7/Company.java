package com.yash.tdd.Intermediate7;

public class Company {
	private String companyname;
	private Employee emp;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Company(String companyname, Employee emp) {
		super();
		this.companyname = companyname;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return "Company [companyname=" + companyname + ", emp=" + emp + "]";
	}
	
	
	
	
}
