package com.springioc_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/springioc_2/applicationcontext.xml");
		PrintMessege pm = (PrintMessege) app.getBean("print_messege");
		System.out.println(pm);
	}
}
