package com.techlab.method;

public class Maximum2 {
	public static void main(String[] args) {
		int[] a = { 100, 20, 550, 600, 80 };
		System.out.println(max(a));
	}

	static int max(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}
}