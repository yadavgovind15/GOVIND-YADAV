package com.techlab.variable;

import java.util.Arrays;

public class ArrayPositiveNegative {
	public static void main(String[] args) {
		int a[] = { 10, 20, -19, 35, 36, -3, -9 };
		int temp,sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}
			System.out.println(a[i]);
			sum = sum+a[i];
		}
		System.out.println(sum);
	

	}
}
