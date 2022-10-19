package com.yash.tdd.Intermediate5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.Intermediate5.Student;

public class StudentTest {
	
	//Student s=new Student();
	@Test
	public void test_ShouldReturn_String_AsOutput() 
	{
		 
		int count=Student.registeredhostel();
		assertEquals(count, 3);
		
	}
	
	

}
