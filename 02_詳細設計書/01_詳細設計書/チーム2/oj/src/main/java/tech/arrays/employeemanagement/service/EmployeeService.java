package tech.arrays.employeemanagement.service;

import java.util.List;

import tech.arrays.employeemanagement.depart.Employee;

public interface EmployeeService {

    List<Employee>listAll();
    
    
   void save(Employee employee) ;
  
		
	
	

}
