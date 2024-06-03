package com.userdemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.userdemo.serviceimp.UserServiceImp;

@SpringBootTest
class UserdemoApplicationTests {
	
	@Mock
    private UserServiceImp userService;

	@Test
	public void saveUser() {
		
	}
	
	
}
