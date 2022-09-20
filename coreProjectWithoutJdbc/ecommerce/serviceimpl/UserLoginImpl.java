package com.ecommerce.serviceimpl;

import java.util.Scanner;

import com.ecommerce.entitites.User;
import com.ecommerce.exception.UserLoginException;
import com.ecommerce.service.UserLogin;

public class UserLoginImpl implements UserLogin{
	int userId;
	String password;
	String emailId;
	
	Scanner sc = new Scanner(System.in);
	User user = new User(this.userId, this.password, this.emailId);
	@Override
	public void getUserDetails() {
		//UserLoginImpl userLoginImpl = new UserLoginImpl();
		System.out.println("Enter user id ");
		this.userId = sc.nextInt();
		System.out.println("Enter password");
		this.password = sc.next();
		System.out.println("Enter email address ");
		this.emailId = sc.next();
		
		
//		user.setUserId(userId);
//		user.setPassword(password);
//		user.setEmail(emailId);
		System.out.println("Profile  created successfully");
	}
		public void login() {
			try {
				//UserLoginImpl userLoginImpl = new UserLoginImpl();
				System.out.println("Please login to your account ");
				System.out.println("Enter user id ");
				int reLoginUserId = sc.nextInt();
				System.out.println("Enter password");
				String reLoginUserpassword = sc.next();
				//User user1 = new User();
				//int userId = user.getUserId();
				//String password = user.getPassword();
				if(reLoginUserId==this.userId && reLoginUserpassword.equals(this.password)) {
					
					System.out.println("Successfully logged in");
					
				}else {
					
					throw new UserLoginException("Invalid login detalis");
					
				}
			}
			catch(Exception e) {
				System.out.println(e);
				UserLoginImpl userLoginImpl = new UserLoginImpl();
				userLoginImpl.login();
			}
		
			}
			
		
		
	}


