package com.techlab.assignment;

public class CommonElementThreeArray {
	public static void main(String[] args) {
		int arr1[] = { 10, 12, 15, 48, 18 };
		int arr2[] = { 12, 8, 9, 10, 14, 18 };
		int arr3[] = { 6, 4, 9, 20, 12, 10, 15, 17, 19, 18 };
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int k = 0; k < arr3.length; k++) {
					if (arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
						count++;
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
}