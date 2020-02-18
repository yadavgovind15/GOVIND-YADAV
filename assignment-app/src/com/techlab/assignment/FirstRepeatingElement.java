package com.techlab.assignment;

public class FirstRepeatingElement {
	public static void main(String[] args) {
		int arr1[] = { 14, 12, 10, 12, 12, 10, 15, 15, 48, 18 };
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {

			for (int j = i + 1; j < arr1.length; j++) {

				if (arr1[i] == arr1[j] && i != j) {
					count = 1;
					System.out.println(arr1[i]);
					break;
				}
			}
			if (count == 1) {
				break;
			}
		}

	}
}