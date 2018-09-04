package com.mkyong.core;

public class Employee {

	private int empId;
	private String empName;
	private int deptId;
	
	/*public int getEmpId() {
		return empId;
	}*/
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	/*public String getEmpName() {
		return empName;
	}*/
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/*
	public int getDeptId() {
		return deptId;
	}*/
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
	 public void printHelloEmp() {
	        System.out.println("Spring 3 : Hello  employee! " + empId + "" + empName + "" + deptId);
	    }
}
