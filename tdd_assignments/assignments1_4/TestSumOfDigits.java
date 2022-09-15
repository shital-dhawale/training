package com.test.tddassignment1_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tdd.assignments1_4.SumOfDigits;

public class TestSumOfDigits {
	@Test
	public void testSumOfDigitsFromGivenString() {
		
		assertEquals(9, SumOfDigits.getSumOfDigitsFromGivenString("2+3+4"));
	}
}
