package com.collection1_9;

import java.util.ArrayList;
import java.util.List;

//You have to create your own hashing function to store the detail of different 
//employees on the basis of their employee id. Now when a new employee object is about 
//to add into list you have to follow following rule. class Employee 
//{ int empid String empname; int salary; String deptname; String address
public class Collection1_9 {
	public static int hashingFunction(int empId) {
		int remainder = 0;
		while(empId!=0) {
			remainder = empId%10;
			empId = empId/10;
			return remainder;
		}
		return remainder;
		
	}
	public static void main(String[] args) {
		//101,102,103,110,112,114,104,
		Employee employee1 =  new Employee(101, "Shital", 65000, "Java", "Chinchwad");
		int index1 = hashingFunction(employee1.getEmpId());
		Employee employee2 =  new Employee(102, "Nishigandha", 63000, "Java", "Wakad");
		int index2 = hashingFunction(employee2.getEmpId());
		Employee employee3 =  new Employee(103, "Kajal", 61000, "Java", "Kothrud");
		int index3 = hashingFunction(employee3.getEmpId());
		Employee employee4 =  new Employee(110, "Meenakshi", 59000, "Java", "BhoomkarChowk");
		int index4 = hashingFunction(employee4.getEmpId());
		Employee employee5 =  new Employee(112, "Pooja", 57000, "Java", "Chinchwad");
		int index5 = hashingFunction(employee5.getEmpId());
		Employee employee6 =  new Employee(114, "Akshay", 56000, "Java", "Akurdi");
		int index6 = hashingFunction(employee6.getEmpId());
		Employee employee7 =  new Employee(104, "Ketan", 55000, "Java", "Chikhli");
		int index7 = hashingFunction(employee7.getEmpId());
		Employee employee8 =  new Employee(205, "Pallavi", 54000, "Java", "Ravet");
		int index8 = hashingFunction(employee8.getEmpId());
		Employee employee9 =  new Employee(306, "Megha", 53000, "Java", "Hinjewadi1");
		int index9 = hashingFunction(employee9.getEmpId());
		Employee employee10 =  new Employee(417, "Reshma", 52000, "Java", "Alandi");
		int index10 = hashingFunction(employee10.getEmpId());
		
		List<Employee> list = new ArrayList();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		
		System.out.println(list);
		System.out.println("Index generated for employee Id " +employee1.getEmpId()+ " is : " +index1);
		System.out.println("Index generated for employee Id " +employee2.getEmpId()+ " is : " +index2);
		System.out.println("Index generated for employee Id " +employee3.getEmpId()+ " is : " +index3);
		System.out.println("Index generated for employee Id " +employee4.getEmpId()+ " is : " +index4);
		System.out.println("Index generated for employee Id " +employee5.getEmpId()+ " is : " +index5);
		System.out.println("Index generated for employee Id " +employee6.getEmpId()+ " is : " +index6);
		System.out.println("Index generated for employee Id " +employee7.getEmpId()+ " is : " +index7);
		System.out.println("Index generated for employee Id " +employee8.getEmpId()+ " is : " +index8);
		System.out.println("Index generated for employee Id " +employee9.getEmpId()+ " is : " +index9);
		System.out.println("Index generated for employee Id " +employee10.getEmpId()+ " is : " +index10);
		
	
		
	}
}