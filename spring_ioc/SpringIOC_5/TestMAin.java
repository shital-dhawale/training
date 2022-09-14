package com.springioc_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMAin {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("com/springioc_5/applicationcontext.xml");
		SetterMessege setmsg = (SetterMessege) app.getBean("sm");
		setmsg.getMessege();
		
	}
}
