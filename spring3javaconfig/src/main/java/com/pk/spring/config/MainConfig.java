package com.pk.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pk.spring.hello.DepartmentInterface;
import com.pk.spring.hello.EmployeeInterface;
import com.pk.spring.hello.impl.Department;
import com.pk.spring.hello.impl.Employee;


@Configuration
public class MainConfig {

	@Bean(name = "helloDept")
	 public DepartmentInterface deptIn () {
	        return new Department();
	    }
	
	@Bean(name = "helloEmp")
	 public EmployeeInterface EmpIn () {
	        return new Employee();
	    }
}
