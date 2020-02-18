package com.techlab.assignment;

public class UnCommonElement {
	public static void main(String[] args) {
		int arr1[] = { 10, 12, 15, 48, 18 };
		int arr2[] = { 12, 8, 9, 10, 14, 18 };
		for (int i = 0; i < arr1.length; i++) {
			int j;
			for (j = 0; j < arr2.length; j++)
				if (arr1[i] == arr2[j])
					break;

			if (j == arr2.length)

				System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			int j;
			for (j = 0; j < arr1.length; j++)
				if (arr2[i] == arr1[j])
					break;

			if (j == arr1.length)

				System.out.println(arr2[i]);
		}
	}
}