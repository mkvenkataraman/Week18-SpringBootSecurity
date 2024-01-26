package com.greatlearning.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/login")
	public String home() {
		return ("<h1> Great Learning</h1>");
	}
}
