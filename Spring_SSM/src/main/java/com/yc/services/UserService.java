package com.yc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.bean.User;
import com.yc.dao.mapper.UserMapper;


@Service
@Transactional(readOnly=true)  // spring 事务  ->  aop机制  ->  代理    ->  两种:   面向接口  -> jdk代理
                                                                //  -> 面向继承   ->  cglib代理        ->   只能扩展  ->  
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@Transactional
	public boolean register(User user) {
		userMapper.insert(user);
		return true;
	}


	public boolean validate(User user) {
		User users = userMapper.selectOne(user);
		if(users != null) {
			return true;
		}else {			
			return false;
		}
	}
	
	public User login(User user) {
		User users = userMapper.selectOne(user);
		if(user != null){
			return user;
		}else {
			return null;
		}
		
	}


}
