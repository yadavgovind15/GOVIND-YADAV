package com.techlab.basic;

public class ArrayPrintName {
	public static void main(String[] args) {
		String ar[] = { "govind ", " Ramesh ", " Ketan" };
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
		}
		System.out.println();

		for (String x : ar) {
			System.out.println(x);
		}
	}
}
