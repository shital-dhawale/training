package com.yash.tdd.Intermediate3;
import java.net.URL;  
import java.util.Scanner;
public class TestCaseI3 {
	public String displayIndex() {
		String url="www.yash.com/index.jsp";
		String file = url.substring(url.lastIndexOf('/')+1, url.lastIndexOf('.'));

		  System.out.println(file);
			
		return file;
	}
		
	
	public String displaySalary() {
		String url="www.yash.com/employee/salary.xhtml";
		String file = url.substring(url.lastIndexOf('/')+1, url.lastIndexOf('.'));

		  System.out.println(file);
			
		return file;
	}
	
	public String displaySearch() {
		String url="www.yash.com/searchdata/search.jsp";
		String file = url.substring(url.lastIndexOf('/')+1, url.lastIndexOf('.'));

		  System.out.println(file);
			
		return file;
	}
	
	public static void main(String args[])throws Exception  
	{  
		 TestCaseI3 tci3=new TestCaseI3();
		
		   
		   
		 tci3.displayIndex();
		 tci3.displaySalary();
		 tci3.displaySearch();
		 }  
		
	
}

