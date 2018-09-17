package com.lingxuanyu.mapper;

import org.apache.ibatis.annotations.Select;

import com.lingxuanyu.entity.User;

public interface UserMapper {
	
	User getUser();
}
