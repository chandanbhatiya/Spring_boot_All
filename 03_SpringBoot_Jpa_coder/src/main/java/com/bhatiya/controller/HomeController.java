package com.bhatiya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.bhatiya.service.UserService;


@Controller
public class HomeController {
	
	//@Autowired
	
private UserService userService;
	
	public HomeController(UserService userService)
	
	{
		this.userService=userService;
	}
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}

@GetMapping("/createUser")
public String registerUser()
{
	String msg=userService.saveUser();
	System.out.println(msg);
	return "success";
}

}
