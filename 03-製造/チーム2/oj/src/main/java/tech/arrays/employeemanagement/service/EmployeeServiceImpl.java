package tech.arrays.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.arrays.employeemanagement.depart.Employee;
import tech.arrays.employeemanagement.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	@Override 
	public List<Employee>listAll(){
		 return repo.findAll();
	}
	@Override
	public void save(Employee emp) {
		repo.save(emp);
	}
	@Override public Employee getById(Long id)
	    {
	        Optional<Employee> optional = repo.findById(id);
	        Employee employee = null;
	        if (optional.isPresent())
	            employee = optional.get();
	        else
	            throw new RuntimeException(
	                "Employee not found for id : " + id);
	        return employee;
	    }
	 
	    @Override public void deleteEmployeeById(long id)
	    {
	        repo.deleteById(id);
	    }
	
	

}
