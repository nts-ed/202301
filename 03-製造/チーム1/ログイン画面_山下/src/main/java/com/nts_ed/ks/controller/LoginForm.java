package com.nts_ed.ks.controller;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LoginForm {

	@NotNull(message = "社員IDを入力してください。")
	@NotBlank(message = "社員IDが存在しておりません。")
	private String id;
	
	@NotNull(message = "パスワードを入力してください。")
	@NotBlank(message = "パスワードが間違っています。")
	@Min(8)
	private String pass;

	public LoginForm() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
