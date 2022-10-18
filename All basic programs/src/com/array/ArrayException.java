package com.array;

public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[5];
try {
arr[6]=15;
System.out.println(arr[6]);
}catch(Exception e) {
	e.printStackTrace();
}


	}

}
