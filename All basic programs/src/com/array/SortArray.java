package com.array;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 4, 2 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted elements");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
