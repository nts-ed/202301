package tech.arrays.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.arrays.employeemanagement.depart.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}
