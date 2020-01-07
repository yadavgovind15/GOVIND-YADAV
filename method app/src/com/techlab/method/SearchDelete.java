package com.techlab.method;

public class SearchDelete {
	public static void main(String[] args) {
		int a[] = { 5, 3, 6, 1, 4, 2 };
		int search = 6;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				System.out.println("item is present index number :" + i);
				temp = temp + 1;

			}
			}

			if (temp == 0) {
				System.out.println("item not foundis list");


		}
	}
	}