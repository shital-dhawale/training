package com.yash.tdd.advance1;

public class AppMain {
	public static void main(String[] args) {

		ApplicationService as = new ApplicationService();
		Application app1 = new Application(101, "aaa");
		Application a = as.addApplication(app1);

	}

}
