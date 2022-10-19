package com.yash.tdd.basic2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.basic2.FactorialNoEx;

public class FactorialNoTest {
	
	
	FactorialNoEx f = new FactorialNoEx();
	@Test
	public void test_Factorial_ShouldReturn_FactorialOfNumber_AsLong() 
	{
		long result=f.factorial();
		assertEquals(result, 720);
		
	}

}
