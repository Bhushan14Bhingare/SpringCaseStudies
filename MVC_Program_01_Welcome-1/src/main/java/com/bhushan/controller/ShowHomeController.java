package com.bhushan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowHomeController {

	@GetMapping("/home")
	public String showHome() {
		return "welcome";
		
	}
}
