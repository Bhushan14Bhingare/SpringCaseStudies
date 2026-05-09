package com.bhushan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bhushan.model.AirWays;

@Controller
public class AirController {

	@GetMapping("/airway")
	public String productBill(Model model) {
		
		AirWays product = new AirWays(2,5000d,18);
		product.setFinalAmount();
		 model.addAttribute("stu", product);
		return "airway";
		
	}
}
