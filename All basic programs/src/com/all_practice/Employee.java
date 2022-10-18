package com.all_practice;

import java.util.Scanner;

public class Employee {
 int id;
String name;
String city;
int salary;
public void getUserInput() {
	
	 Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee id>>");
	id=sc.nextInt();
	System.out.println("Enter Employee name>>");
	name=sc.next();
	System.out.println("Enter city>>");
	city=sc.next();
	System.out.println("Enter salary>>");
	salary=sc.nextInt();
	getInformation(id,name,city,salary);
}
	
	public void getInformation(int id,String name,String city,int salary) {
		System.out.println("Employee Information:");
		System.out.println("Id>>"+id);
		System.out.println("Name"+name);
		System.out.println("City>>"+city);
		System.out.println("Salary>>"+salary);
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the number of employees");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		
		
		for(int i=1;i<=count;i++) {
		Employee emp=new Employee();
		emp.getUserInput();
		

	}
	}
}
