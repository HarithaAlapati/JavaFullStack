package com.model.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	@GetMapping("/")
	public String getHome() {
		return "home.jsp";
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "test.jsp";
	}
}
