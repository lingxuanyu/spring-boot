package com.lingxuanyu.controller;

import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lingxuanyu.entity.User;

@EnableAutoConfiguration
@RestController
public class UserController {
	@RequestMapping("/getAllUser")
	public User getUser(Map map) {
		User user = new User();
		user.setId(1);
		user.setUsername("liyufei");
		user.setPassword("liyufei");
		return user;
	}
}
