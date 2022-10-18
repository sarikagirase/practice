package com.array;
//write a program find two number in array having sum=10
public class TwoPairs {

	public static void main(String[] args) {
		int[] arr= {8,7,2,5,3,1};
		int sum=10;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]+"," +arr[j]);
				}
			}
		}
		
		

	}

}
