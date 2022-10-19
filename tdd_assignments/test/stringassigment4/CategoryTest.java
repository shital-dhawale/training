package com.yash.tdd.stringassigment4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.stringassigment4.Category;

public class CategoryTest {

	Category ct=new Category();
	
	@Test
	public void test_category_String_as_output()
	{
	 String str=ct.showCategoryDetail();
	ct.setId("101");
	ct.setName("javabasics");
	ct.setCreatedDate("31-01-2017");
	 assertEquals(str,"{id:"+"101"+","+"name:"+"javabasics"+","+"createdDate:"+"31-01-2017"+"}");
		
	}
}
