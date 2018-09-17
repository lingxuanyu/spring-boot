package com.lingxuanyu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lingxuanyu.entity.User;
import com.lingxuanyu.service.UserService;

@EnableAutoConfiguration
@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@RequestMapping("/getAllUser")
	public User getUser(Map map) {
		User user = userService.getUser();
		return user;
	}
}
