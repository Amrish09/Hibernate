package com;

public class Employee {
	int a;
	private Employee() {
		
	}
	public void display() {
		System.out.println("Buisness method"+a);
	}
	private static Employee emp=new Employee();
	
	public static Employee getInstance(int code) {
	if(code==1) {
		return emp;
	} else {
		return null;
	}
	}

}
