package com.oops1_1;

public class TestMain {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Customer cust = new Customer();
		Department department = new Department();
		emp.setpId(1);
		emp.setpName("shital dhawale");
		emp.setSalary(65000);
		emp.setBaseLocation("Hinjewadi,Pune");
		emp.setContactNo("1839289372139");
		emp.setEmailId("shital.dhawale@yash.com");
		emp.setDob("05/01/1995");
		emp.setpAddress("Chinhwad, Pune");
		department.setDeeptId(1);
		department.setdName("Java");
		emp.setDepartment(department);
		
		cust.setpId(1);
		cust.setpName("rupesh");
		
		
	}

}
