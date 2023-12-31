package com.pro1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pro1.model.User;

@Controller
public class indexcontroller {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/submitForm")
	public String userRegistration(@ModelAttribute User user, Model model) {
		System.out.println(user.toString());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		model.addAttribute("Name", user.getName());
		model.addAttribute("Email", user.getEmail());
		model.addAttribute("Password", user.getPassword());
		return "welcome";
	}
}
