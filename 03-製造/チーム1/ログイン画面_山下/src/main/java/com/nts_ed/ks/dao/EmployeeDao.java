package com.nts_ed.ks.dao;

import java.util.List;

import com.nts_ed.ks.entity.EmployeeEntity;

public interface EmployeeDao {

	void selectByEmployeeId(EmployeeEntity employee);
	
	void selectByPass(EmployeeEntity employee);
	
	List<EmployeeEntity> getAll();
}
