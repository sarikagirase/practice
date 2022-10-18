package com.array;
//find even and odd numbers from given array
public class FindEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,6,7,8};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
			System.out.println("Even number are>>"+arr[i]);
		}
			else {
				System.out.println("odd numbers are>>"+arr[i]);
			}

	}

}
}