package com.yash.tdd.Intermediate5;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int student_id;
	private String student_name;
	private String student_class;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_class="
				+ student_class + "]";
	}
	
	

		public Student(int student_id) {
			super();
			this.student_id = student_id;
		}
		public Student(int student_id, String student_name, String student_class) {
			super();
			this.student_id = student_id;
			this.student_name = student_name;
			this.student_class = student_class;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		
		public static int registeredhostel()
		{
			 Student s1 = new Student(1,"aaa","first year B.E"); 
			 Student s2 = new Student(2,"bbb","second year B.E"); 
			 Student s3 = new Student(3,"ccc","third year B.E");
			 
			 
			 List<Student> list=new ArrayList<Student>();
			 list.add(s1);
			 list.add(s2);
			 list.add(s3);
			  
			 int rh=list.size();
			 
			 System.out.println("No of student registered in hostel   "+rh);
			 return rh;
		}
	    public static void main(String[] args) {
	    	
			
			 int StudentRegistered=Student.registeredhostel();
			 
			//System.out.println("number of Student Registered are" +StudentRegistered);
		}
		
	

}