package com.string;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Example {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		al.add(30);
		LinkedHashSet<Integer> ls= new LinkedHashSet<Integer>(al);
		System.out.println(ls);
		
	}


}
