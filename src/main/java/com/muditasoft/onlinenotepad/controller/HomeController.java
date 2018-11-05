package com.muditasoft.onlinenotepad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.muditasoft.onlinenotepad.model.User;
import com.muditasoft.onlinenotepad.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showLoginPage() {
		return "login";
	}

	@GetMapping("/signup")
	public String showSignUpPage(Model model) {
		User user = new User();

		model.addAttribute("user", user);

		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user) {
		if(user.getPassword().equals(user.getPassword2())) {
			userService.save(user);
			return "redirect:/notes/";
		} else {
			return "redirect:/signup";
		}
	}
}
