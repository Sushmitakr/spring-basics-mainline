package com.pk.spring.hello.impl;

import com.pk.spring.hello.EmployeeInterface;

public class Employee implements EmployeeInterface {
	
	private int empId;
	private String empName;
	private int deptId;
	
	@Override
	public void displayEmployeeMsg(String empMsg) {
		// TODO Auto-generated method stub
		System.out.println("Asked msg is: "+ empMsg);
	}

	@Override
	public void setEmpId(int empId) {
		// TODO Auto-generated method stub
		this.empId = empId;
	}

	@Override
	public void setEmpName(String empName) {
		// TODO Auto-generated method stub
		this.empName = empName;
	}

	@Override
	public void setDeptId(int deptId) {
		// TODO Auto-generated method stub
		this.deptId = deptId;
	}

	@Override
	public int getEmpId() {
		// TODO Auto-generated method stub
		return empId;
	}

	@Override
	public String getEmpName() {
		// TODO Auto-generated method stub
		return empName;
	}

	@Override
	public int getDeptId() {
		// TODO Auto-generated method stub
		return deptId;
	}

	
}
