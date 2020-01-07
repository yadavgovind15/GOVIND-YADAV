package com.techlab.variabledemo;

public class array1 {
	public static void main(String[] args) {
		int a[] = { 10, 11, 10, 12, 12 };
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; i++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate" + a[i]);
				}

			}

		}
	}
}
