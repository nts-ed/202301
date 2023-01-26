package com.nts_ed.ks.param;

import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginParam {

	@NotNull(message = "社員IDを入力してください。")
	private String id;
	@NotNull(message = "パスワードを入力してください。")
	private String pass;
}
