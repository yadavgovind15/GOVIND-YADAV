package com.techlab.assignment;

public class PrintDuplicate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 6, 2, 6, 8, 5, 9, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println(arr[j ]);
				}
			}
		}
	}
}