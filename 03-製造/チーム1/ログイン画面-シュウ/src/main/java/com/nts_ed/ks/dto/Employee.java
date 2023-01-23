package com.nts_ed.ks.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "T_EMPLOYEE")
public class Employee {
	
	@Id
	private String EMPLOYEE_ID;
	private String PASSWORD;
	private int DEL_FLG;
}
