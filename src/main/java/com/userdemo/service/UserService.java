package com.userdemo.service;

import java.util.List;

import com.userdemo.model.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public List<User> getAllUser();

}
