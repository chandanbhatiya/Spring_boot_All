package com.bhatiya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhatiya.entity.User;
import java.util.List;


public interface UserRepo  extends JpaRepository<User, Integer>{
	
	public User  findByEmail(String email);
	
	

}
