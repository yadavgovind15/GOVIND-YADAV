package com.techlab.assignment;

public class PairsElements {
	public static void main(String[] args) {
		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };
		int i = 0;
		int j = 0;
		 int sum = 10;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					int sum1 = arr[i] + arr[j];
					System.out.println("(" + arr[i] + " ," + arr[j] + ")");

					System.out.println(sum1);

				}
			}
		}

	}
} 