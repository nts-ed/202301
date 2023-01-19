package com.nts_ed.ks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nts_ed.ks.dto.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	@Query(value = "SELECT * FROM t_employee WHERE employee_id = :EMPLOYEE_ID AND password = :PASSWORD", nativeQuery = true)
	List<Employee> checkEmployee(@Param("EMPLOYEE_ID") String id, @Param("PASSWORD") String password);
}
