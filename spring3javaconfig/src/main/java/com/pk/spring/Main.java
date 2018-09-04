package com.pk.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pk.spring.config.MainConfig;
import com.pk.spring.hello.DepartmentInterface;
import com.pk.spring.hello.EmployeeInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String msg = "DEpartment msg";
	        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
	        DepartmentInterface obj = (DepartmentInterface) context.getBean("helloDept");

	        obj.displayMsg("Hi " + msg);
	        
	        
	     String empMsg = "Employee msg";
	     EmployeeInterface empp = (EmployeeInterface) context.getBean("helloEmp");
	     empp.setEmpId(10);
	     empp.setEmpName("sushmita");
	     empp.setDeptId(10);
	     empp.displayEmployeeMsg("Hello employee :"+empMsg);
	}

}
