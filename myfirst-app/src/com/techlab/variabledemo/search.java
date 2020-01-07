package com.techlab.variabledemo;

public class search {
	public static void main(String[] args) {
		int a[] = { 10, 11, 10, 13, 15, 17, 18, 10, 25, 15, 10 };
		int search = 10, count = 0;
		for (int i = 0; i < a.length; i++) {
			if (search == a[i]) {
				count++;
				System.out.println(search + "found at" + i);
			}

		}
		System.out.println("total number of repeat " + count);

	}

}
