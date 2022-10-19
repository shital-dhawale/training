package com.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.model.User;
import com.hospitalmanagement.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("getUserbyId/{userid}")
	public ResponseEntity<User> getuserbyId(@PathVariable int userid) {
		User user2 = userService.getUserById(userid);
		return ResponseEntity.ok().body(user2);
	}
	@PostMapping("/login")
	//@CrossOrigin(origins = "http://localhost:4201")
	public User getUserByEmailAndPassword(@RequestBody User user) throws Exception {
		String tempEmail = user.getEmail();
		String tempPassword = user.getPassword();
		User user1 = null;
		if(tempEmail!=null && tempPassword!=null) {
			user1 = userService.fetchUserByEmailAndPassword(tempEmail, tempPassword);
		}
		if(user1 == null) {
			throw new Exception("Invalid credentials");
		}
		return user1;
		
	}
	@PostMapping("/RegisterUser")
	
	public ResponseEntity<User> saveUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmail();
		if(tempEmailId!=null && "".equals(tempEmailId)) {
			User user1 = userService.fetchUserByEmailId(tempEmailId);
			if(user1!=null) {
				throw new Exception("user with " +tempEmailId+ "is already exists");
			}
		}
		User user1 = userService.saveUser(user);
		return ResponseEntity.ok().body(user1);
	}
	@DeleteMapping("/deleteById/{user_Id}")
	public void deletebyId(@PathVariable int user_Id) {
		userService.deleteUserById(user_Id);
	}
	@PutMapping("updateUserbyId/{user_id}")
	public ResponseEntity<User> updateuserbyid(@PathVariable int user_id, @RequestBody User user){
		User user1 = userService.getUserById(user_id);
		user1.setFirstName(user.getFirstName());
		user1.setLastName(user.getLastName());
		user1.setEmail(user.getEmail());
		user1.setPassword(user.getPassword());
		user1.setReTypePassword(user.getReTypePassword());
		User user2 = userService.saveUser(user1);
		return ResponseEntity.ok().body(user2);
		
	}

}
