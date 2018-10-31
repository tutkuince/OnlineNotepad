package com.muditasoft.onlinenotepad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/details")
	public String getDetails() {
		return "details";
	}
	
	@GetMapping("/addNote")
	public String addNote() {
		return "addNote";
	}
}
