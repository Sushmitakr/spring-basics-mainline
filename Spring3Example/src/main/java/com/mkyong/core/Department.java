package com.mkyong.core;

public class Department {

	private int deptId;
	private String deptName;
	
	/*public int getDeptId() {
		return deptId;
	}*/
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	/*public String getDeptName() {
		return deptName;
	}*/
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	 public void printHelloDept() {
	        System.out.println("Spring 3 : Hello Department! " + " "+ deptId + " " + "department Name:" + deptName);
	    }
}
