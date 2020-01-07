package com.techlab.method;

public class EvenMethod {
	public static void main(String[] args) {
		System.out.println(evennumber(20));
	}

	static int evennumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}

		}
		return 0;

	}
}
