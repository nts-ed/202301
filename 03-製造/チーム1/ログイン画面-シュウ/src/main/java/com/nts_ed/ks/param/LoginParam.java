package com.nts_ed.ks.param;

import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginParam {

	@NotBlank(message = "社員IDを入力してください。")
	private String id;
	@NotBlank(message = "パスワードを入力してください。")
	private String pass;
}
