package com;

public class Employee1 {
	private int empId;
	private String fname;
	private String lname;
	private int age;
	private String desg;
	public Employee1() {
		super();
	}
	public static class EmployeeBuilder{
		public Employee1 EmployeeBuilder(int empId) {
			Employee1 emp=new Employee1();
			emp.empId=empId;
			return emp;0	
		}
	}
	

}
