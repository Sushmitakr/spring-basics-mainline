package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringConfig.xml");
		
		Department objDepartment = (Department) context.getBean("helloDept");
		objDepartment.printHelloDept();

        Employee objEmployee = (Employee) context.getBean("helloEmp");
        objEmployee.printHelloEmp();
	}

}
