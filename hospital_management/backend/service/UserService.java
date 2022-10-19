package com.hospitalmanagement.service;

import java.util.Optional;

import com.hospitalmanagement.model.User;

public interface UserService {
	public User saveUser(User user);
	public User getUserById(int userId);
	public void deleteUserById(int user_id);
	public User fetchUserByEmailId(String email);
	public User fetchUserByEmailAndPassword(String email, String password);
}
