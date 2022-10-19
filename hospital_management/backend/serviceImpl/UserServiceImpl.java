package com.hospitalmanagement.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.model.User;
import com.hospitalmanagement.repository.UserRepository;
import com.hospitalmanagement.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		return userRepository.save(user);
	}

	
	@Override
	public User getUserById(int userId) {
		User user = new User();
		try {
			user = convertToUser(userRepository.findById(userId));
			
		}catch(Exception e) {
			System.out.println("Something went wrong");
			
		}
		
		return user;
	}
	public User convertToUser(Optional<User> user) {
		User user1 = new User();
		if(user!=null) {
			user1.setUser_id(user.get().getUser_id());
			user1.setFirstName(user.get().getFirstName());
			user1.setLastName(user.get().getLastName());
			user1.setEmail(user.get().getEmail());
			user1.setPassword(user.get().getPassword());
			user1.setReTypePassword(user.get().getReTypePassword());
		}
		return user1;
	}

	@Override
	public void deleteUserById(int user_id) {
		userRepository.deleteById(user_id);
		
	}


	@Override
	public User fetchUserByEmailId(String email) {
		User user1 = userRepository.findByEmail(email);
		return user1;
	}


	@Override
	public User fetchUserByEmailAndPassword(String email, String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		return user;
	}

	

}
