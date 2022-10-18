package com.numbers;

public class ReturnTable {
	private int getTable(int num) {
		int temp=num;
		for(int i=1;i<=10;i++) {
			int table=num*i;
			System.out.println(table);
		}
		return temp;
	}
	public static void main(String[] args) {
		ReturnTable ret=new ReturnTable();
	ret.getTable(8);

	}

}
