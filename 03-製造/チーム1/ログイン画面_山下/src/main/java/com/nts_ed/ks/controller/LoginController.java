package com.nts_ed.ks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nts_ed.ks.dto.Employee;
import com.nts_ed.ks.param.LoginParam;
import com.nts_ed.ks.repository.EmployeeRepository;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping(path = "/login")
	public String login(LoginParam param) {
		// 社員のチェックを行います
		List<Employee> isExists = employeeRepository.checkEmployee(param.getId(), param.getPass());
		if (isExists.size() == 1) {
			return "/login/index";
		}
		return "index";
	}

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}
}
