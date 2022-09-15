package com.test.tddassignment1_2;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import com.tdd.assignments1_2.Factorial;
//Q2: Write a TDD based app to find out the factorial of given number
public class TestFactorial {
	@Test
	public void testFactorial() {
		Factorial factorial = new Factorial();
		assertEquals(24, factorial.getFactorial(4));
		
		
	}
}
