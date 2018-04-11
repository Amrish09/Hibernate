package com;

public class FactoryMethodTest {

	public static void main(String[] args) {
		Employee emp=Employee.getInstance(6);
		emp.display();

	}

}
