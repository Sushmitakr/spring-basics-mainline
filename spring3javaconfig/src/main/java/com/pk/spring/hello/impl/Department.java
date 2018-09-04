package com.pk.spring.hello.impl;

import com.pk.spring.hello.DepartmentInterface;

public class Department implements DepartmentInterface{

	@Override
	public void displayMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Asked msg is: "+ msg);
	}

}
