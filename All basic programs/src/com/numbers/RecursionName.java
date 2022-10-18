package com.numbers;
//print name 10 times without using loop
public class RecursionName {
	public static void getName(String str,int no) {
	
		if(no>0) {
			System.out.println(str);
			no=no-1;
			getName(str,no);
		}else {
			return;
		}
	}

	public static void main(String[] args) {
		getName("sarika",10);

	}

}
