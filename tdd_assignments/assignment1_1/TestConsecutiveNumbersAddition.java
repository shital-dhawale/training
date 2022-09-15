package com.test.tddassignments1_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tdd.assignment1_1.ConsecutiveNumbersAddition;

public class TestConsecutiveNumbersAddition {
	@Test
	public void consecutiveNumbersAdditionTest() {
		ConsecutiveNumbersAddition c = new ConsecutiveNumbersAddition(); 
		assertEquals(55, c.add());
	}
}
