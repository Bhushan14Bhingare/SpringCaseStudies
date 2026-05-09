package com.bhushan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bhushan.model.ProductDetails;

@Controller
public class ProductController {

	@GetMapping("/giveBill")
	public String productBill(Model model) {
		
		ProductDetails product = new ProductDetails(2,5600d);
		product.setFinalPrice();
		 model.addAttribute("stu", product);
		return "giveBill";
		
	}
}
