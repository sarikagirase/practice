package com.all_practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("sarika", 1);
		map.put("Dipali", 2);
			Set<String> set=map.keySet();
			Iterator<String> itr=set.iterator();
			while(itr.hasNext()) {
				String s=itr.next();
				System.out.println("key>>"+s);
				System.out.println("values>>"+map.get(s));
			}
	}


}