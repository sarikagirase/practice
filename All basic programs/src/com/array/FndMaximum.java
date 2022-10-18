package com.array;
//find maximum salary or value
public class FndMaximum {

	public static void main(String[] args) {
		int[] arr= {20000,45000,60000,30000};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			
		}
System.out.println("Maximum salary is>>"+max);
	}

}
