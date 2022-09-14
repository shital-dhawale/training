package com.springioc_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("com/springioc_4/applicationcontext.xml");
		ConstructorMessege conmsg = (ConstructorMessege) app.getBean("constructormessege");
		System.out.println("hello");
	}
}
