package com.muditasoft.onlinenotepad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.muditasoft.onlinenotepad.model.User;
import com.muditasoft.onlinenotepad.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	
	@GetMapping
	@RequestMapping("/index")
	public String getIndex() {
		User user = new User();
		user.setUserName("ttk");
		user.setPassword("112");
		userService.save(user);
		return "index";
	}
	
	@GetMapping
	@RequestMapping("/details")
	public String getDetails() {
		return "details";
	}
}
