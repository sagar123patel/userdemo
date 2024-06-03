package com.userdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userdemo.model.User;
import com.userdemo.serviceimp.UserServiceImp;

@RestController
public class UserController {

	@Autowired
	private UserServiceImp userServiceImp;

	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {

		return userServiceImp.saveUser(user);
	}

	@GetMapping("/user")
	public List<User> getAllUser() {
		return userServiceImp.getAllUser();
	}

}
