package com.pk.spring.hello;

public interface EmployeeInterface {

	void setEmpId(int empId);
	void setEmpName(String empName);
	void setDeptId(int deptId);
	
	void displayEmployeeMsg(String empMsg);
	
	int getEmpId();
	String getEmpName();
	int getDeptId();
	
	
}
