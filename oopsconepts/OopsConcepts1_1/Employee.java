package com.oops1_1;
//salary, date_of_joining, 
//base_location, deptobj, contactno, emailid
public class Employee extends Person {
		private int salary;
		private String baseLocation;
		private Department department;
		private String contactNo;
		private String emailId;
		
		//super.pId=1;
		
		
		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getBaseLocation() {
			return baseLocation;
		}

		public void setBaseLocation(String baseLocation) {
			this.baseLocation = baseLocation;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

		public String getContactNo() {
			return contactNo;
		}

		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public static void main(String[] args) {
			Employee emp = new Employee();
		
		}
}
