package com.muditasoft.onlinenotepad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getLoginPage() {
		return "login";
	}

	@GetMapping("/signup")
	public String getSignUpPage() {
		return "register";
	}
}
