package com.array;
//find second highest salary or second highest number in array
public class SecondHighest {

	public static void main(String[] args) {
		int[] arr= {10000,35000,25000,40000};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			
		}
		System.out.println("2nd highest salary is>>"+arr[1]);

	}

}
