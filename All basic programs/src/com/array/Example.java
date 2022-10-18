package com.array;

public class Example {

	public static void main(String[] args) {
		try {
		int a=10/0;
		System.out.println(a);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
