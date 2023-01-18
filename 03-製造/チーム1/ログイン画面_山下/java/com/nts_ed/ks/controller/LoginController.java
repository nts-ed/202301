package com.nts_ed.ks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
	
//	@Autowired
//	public EmployeeModel employeeModel; 
	
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@PostMapping("/login")
	public String login(Model model) {
		return "login/index";
	}
}
