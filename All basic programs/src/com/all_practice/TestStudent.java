package com.all_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestStudent {

	public static void main(String[] args) {
		Map<Student,Integer> map=new HashMap<Student,Integer>();
		Student stud=new Student("Sarika",1,80);
		Student stud1=new Student("Dipali",2,70);
		map.put(stud, stud.rollNo);
		map.put(stud1, stud1.marks);
		Set<Student> set = map.keySet();
		for( Object i:set) {
			System.out.println(i);
			
		}

	}

}
