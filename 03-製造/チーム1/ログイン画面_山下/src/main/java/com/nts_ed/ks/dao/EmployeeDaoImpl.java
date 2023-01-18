package com.nts_ed.ks.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nts_ed.ks.entity.EmployeeEntity;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void selectByEmployeeId(EmployeeEntity employee) {
		jdbcTemplate.update("SELECT * FROM t_employee WHERE employee_id");
	}

	@Override
	public void selectByPass(EmployeeEntity employee) {
		jdbcTemplate.update("SELECT * FROM t_employee WHERE password");
	}

	@Override
	public List<EmployeeEntity> getAll() {
		String sql = "SELECT employee_id,password FROM t_employee";
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
		List<EmployeeEntity> list = new ArrayList<>();
		for(Map<String, Object> result : resultList) {
			EmployeeEntity employee = new EmployeeEntity();
			employee.setEmployee_id((String)result.get("employee_id"));
			employee.setPassword((String)result.get("password"));
			list.add(employee);
		}
		return list;
	}

}
