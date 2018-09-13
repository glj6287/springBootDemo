package com.winter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.winter.model.User;
import com.winter.service.user.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemoApplicationTests {
	
	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
		
		User user = new User();
		user.setUserName("222");
		user.setUserId(222);
		user.setPassword("2222");
		user.setPhone("222");
		userService.addUser(user );
		
	}

}
