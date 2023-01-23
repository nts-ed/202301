package com.nts_ed.ks.dto;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "T_Employee")
public class Employee {

	@Id
	private String EMPLOYEE_ID;
	private String EMPLOYEE_NAME;
	private String PASSWORD;
	private String DEPT_ID;
	private int DEL_FLG;
	private Date CREATE_DATE;
	private String CREATE_USER;
	private Date UPDATE_DATE;
	private String UPDATE_USER;
	
}
