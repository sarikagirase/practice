package com.numbers;
//print 1 to 100 without using loop
public class RecursionNumber {
	static int count=0;
	public static void getData() {
		count++;
		if(count<=100) {
			
		
		
		System.out.println(count);
		getData();
	}
	}
	public static void main(String[] args) {
	getData();
		
		
			}

}
