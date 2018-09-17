package com.lingxuanyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingxuanyu.entity.User;
import com.lingxuanyu.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User getUser() {
		User user = userMapper.getUser();
			return user;
	}
}
