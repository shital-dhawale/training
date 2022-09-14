package com.springioc_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appliactionContext = new ClassPathXmlApplicationContext("com/springioc_1/applicationcontext.xml");
		Employee emp = (Employee) appliactionContext.getBean("employee");
		System.out.println(emp);
	}
}
