package tech.arrays.employeemanagement.depart;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

;
@Data
@Entity
@Table(name = "T_USERS")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name ="joiningDate")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate joiningDate;
	
	@Column(name="retiringDate")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate retiringDate;
	
	@Column(name ="dept")
	private String dept;
	
	@Column(name ="mailaddress")
	private String mailaddress;
	
	
	
	
	
	
	

}
