package com.techlab.assignment;

import java.util.Arrays;

public class SwappingWithoutAdditional {
	public static void main(String[] args) {

		SwappingWithoutAdditional ar = new SwappingWithoutAdditional();

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		ar.reverseArray(a);

	}

	public void reverseArray(int[] a) {
		int middle = a.length / 2;
		int i = 0, j = a.length - 1, temp = 0;

		for (i=0,j=a.length-1; i < middle; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		System.out.println(Arrays.toString(a));
	}
}
