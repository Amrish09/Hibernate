package com;

public class SingletonTest {
	public static void main(String args[]) {
		Employee emp1=Employee.getInstance(1);
		emp1.a=20;
		emp1.display();
		
		
		Employee emp2=Employee.getInstance(1);
		emp2.display();
	}

}
