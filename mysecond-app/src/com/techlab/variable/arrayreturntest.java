package com.techlab.variable;

public class arrayreturntest {
	public static void main(String[] args) {
		int a[] = even();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	static int[] even() {
		int a[]= {2,5,6,8,7,9,11}; 
		return a;
		

	}
}