package com.array;

public class FindMinumum {

	public static void main(String[] args) {
		int[] arr= {20000,50000,15000,80000};
int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}

	}
System.out.println("Minumun salary is>>"+min);
}
}