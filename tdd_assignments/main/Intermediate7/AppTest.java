package com.yash.tdd.Intermediate7;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
	
	
	public int countemployee(){
		
		Employee emp1=new Employee(101,"aaa","Software Engineer");
		Employee emp2=new Employee(102,"bbb","module lead");
		Employee emp3=new Employee(103,"ccc","Mangaer");
		Employee emp4=new Employee(104,"ddd","Hr");
		Employee emp5=new Employee(105,"eee","CEO");
		
		Company c1=new Company("Yash",emp1);
		Company c2=new Company("Yash",emp2);
		Company c3=new Company("Yash",emp3);
		Company c4=new Company("Yash",emp4);
		Company c5=new Company("Yash",emp5);
		
		List<Company> list=new ArrayList<Company>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		
		int empno=list.size();
		System.out.println("no of employee working in "+empno);
		
		
		return empno;
			
	}
public static void main(String[] args) {
	
	AppTest ap=new AppTest();
	
	int empcount=ap.countemployee();
	System.out.println(empcount);
	
}
}
