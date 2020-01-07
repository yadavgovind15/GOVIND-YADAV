package com.techlab.method;

public class Maximum {
	public static void main(String[] args) {
		int[] a = { 100, 20, 550, 60, 80 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		System.out.println(max);

	}
}