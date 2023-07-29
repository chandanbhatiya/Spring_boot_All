package com.bhatiya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bhatiya.repository.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public String saveUser()
	{
		boolean f=userDao.save();
		if(f) {
			
			return "Register sucessfully";
		}
		else {
			return "server errors";
		}
	}

}
