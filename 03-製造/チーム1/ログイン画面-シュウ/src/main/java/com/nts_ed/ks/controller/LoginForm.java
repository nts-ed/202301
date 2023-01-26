package com.nts_ed.ks.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LoginForm {

	@NotNull(message = "社員IDが存在しません。")
	@NotBlank(message = "社員IDを入力してください。")
	private String id;
	
	@NotNull(message = "パスワードが間違っています。")
	@NotBlank(message = "パスワードを入力してください。")
	private String pass;
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPass() {
		return this.pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
}
