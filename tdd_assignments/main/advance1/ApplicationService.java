package com.yash.tdd.advance1;

public class ApplicationService {

	public Application addApplication(Application application) {

		if (application != null) {
			System.out.println("Application sucessfully created" + application);
		}

		return application;

	}
}
