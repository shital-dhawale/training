package com.yash.tdd.basic3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.basic3.CountEvenOddDigit;

public class CountEvenOddDigitTest {
	
	CountEvenOddDigit ceodt=new CountEvenOddDigit();
	
	@Test
	public void text_GivenNo_ShoudReturn_countevenodd()
	{
		String result=ceodt.countevenodd();
		assertEquals(result,4+"even digit"+5+"odd_count");
	}

}
