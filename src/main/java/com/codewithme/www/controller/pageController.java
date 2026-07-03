package com.codewithme.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codewithme.www.service.CategoryService;
import com.codewithme.www.service.ProductService;

@Controller
public class pageController {
	
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductService productService;
	
	@GetMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("categories",categoryService.getAll());
		model.addAttribute("products",productService.getAll());
		return "shop";
		
	}
}
