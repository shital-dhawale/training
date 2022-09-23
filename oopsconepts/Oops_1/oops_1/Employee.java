package com.oops_1;

public class Employee {
	private int salary;
	private String date_of_joining;
	private String base_location;
	private String deptobj;
	private String contactno;
	private String emailid;

	public Employee(int pid, String pname, String paddress, String dob, int salary, String date_of_joining,
			String base_location, String deptobj, String contactno, String emailid) {
		super();
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getBase_location() {
		return base_location;
	}

	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}

	public String getDeptobj() {
		return deptobj;
	}

	public void setDeptobj(String deptobj) {
		this.deptobj = deptobj;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_location="
				+ base_location + ", deptobj=" + deptobj + ", contactno=" + contactno + ", emailid=" + emailid + "]";
	}
}
