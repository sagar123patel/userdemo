package com.userdemo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userdemo.dao.UserDao;
import com.userdemo.model.User;
import com.userdemo.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
