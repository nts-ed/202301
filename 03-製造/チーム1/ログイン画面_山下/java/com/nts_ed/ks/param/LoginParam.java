package com.nts_ed.ks.param;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginParam {

	@NotNull(message = "社員IDを入力してください。")
	@NotBlank(message = "社員IDは存在しません。")
	@Length(min = 10, max = 10)
	private String id;
	
	@NotNull(message = "パスワードを入力してください。")
	@NotBlank(message = "パスワードが間違っています。")
	@Min(8)
	private String pass;
}
