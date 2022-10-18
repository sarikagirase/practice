package com.string;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int countvowels=0;
		int countnumbers=0;
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countvowels ++;
			}
			if(ch<='9'&&ch>='0') {
				countnumbers++;
			}
			
		}
System.out.println("Total vowels are>>"+countvowels);
System.out.println("Total numbers are>>"+countnumbers);

	}

}
