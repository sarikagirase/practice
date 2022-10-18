package com.all_practice;

public class Age {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		int age=15;
		System.out.println("Hello");
	

		try {
		if(age<18) {
			throw new CustomException("Invalid age");
			}
		else {
			System.out.println("You can vote now");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			

}
}}