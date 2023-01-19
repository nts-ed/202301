package com.nts_ed.ks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
	
	@GetMapping("/")
	public String index(LoginParam param, Model model) {
		model.addAttribute("title", "勤怠管理システム");
		return "index";
	}

	@PostMapping("/login")
	public String login(@Validated LoginParam param, BindingResult result, Model model) {
		// 社員のチェックを行います
		List<Employee> isExists = employeeRepository.checkEmployee(param.getId(), param.getPass());
		if (isExists.size() == 1) {
			model.addAttribute("title", "勤怠管理成功");
			return "/login/index";
		}
		if(result.hasErrors()) {
			model.addAttribute("title", "勤怠管理エラー");
//			model.addAttribute("error", "社員IDが入力されていません。");
			return "login/error";
		}
		return "index";
	}

	
}
