package com.muditasoft.onlinenotepad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.muditasoft.onlinenotepad.model.User;
import com.muditasoft.onlinenotepad.service.LoginService;
import com.muditasoft.onlinenotepad.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@Autowired
	private LoginService loginService;

	@GetMapping("/showlogin")
	public String showLoginPage(@RequestParam(value = "status", required = false) String status, Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("user") User user, Model model) {
		if (userService.getUserByUsernameAndPass(user) != null) {
			return "redirect:/notes/";
		}
		return "redirect:/showlogin";
	}

	@GetMapping("/signup")
	public String showSignUpPage(Model model) {
		User user = new User();

		model.addAttribute("user", user);

		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute("user") User user, Model model) {
		if (loginService.isValid(user.getPassword(), user.getPassword2())) {
			userService.save(user);
			return "redirect:/notes/";
		} else {
			return "redirect:/signup";
		}
	}

	@GetMapping("/reg/{keyCode}")
	public String regOk(@PathVariable("keyCode") String keyCode, Model model) {
		if (userService.getUserByKeyCode(keyCode) != null)
			return "redirect:/showlogin?status=ok";
		return "redirect:/showlogin?status=error";
	}
}
