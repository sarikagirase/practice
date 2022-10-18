package com.array;
//check two arrays are equal or not
import java.util.Arrays;

public class CheckEqual {

	public static void main(String[] args) {
		int[] a1= {1,2,3,4};
		int[] a2= {2,1,3,4};
		boolean status = Arrays.equals(a1, a2);
		if(status==true) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println(" Both Arrays are not equal");
		}

	}

}
