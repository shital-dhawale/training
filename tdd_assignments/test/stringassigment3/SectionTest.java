package com.yash.tdd.stringassigment3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.yash.tdd.stringassigment3.Section;

public class SectionTest {
	Section st=new Section();
	
	@Test
	public void test_document_String_as_output()
	{
	 String str=st.showSectionDetail();
	 st.setId("101");
		st.setName("core_java");
		st.setCreatedDate("31-01-2017");
	 assertEquals(str,"{id:"+"101"+","+"name:"+"core_java"+","+"createdDate:"+"31-01-2017"+"}");
		
	}

}
