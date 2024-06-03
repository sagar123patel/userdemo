package com.userdemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.userdemo.model.User;
import com.userdemo.repository.UserRepo;

@Component
public class UserDao {
	
	
	@Autowired
	private UserRepo userRepo;
	
	
	public User saveUser(User user) {
		
		return userRepo.save(user);
	}

	public List<User> getAllUser() {
		return userRepo.findAll();
	}
}
