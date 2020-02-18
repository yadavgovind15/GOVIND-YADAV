package com.techlab.assignment;

import java.util.Arrays;

public class ContinuousSubArray {
	public static void main(String[] args) {
		int arr[] = { 42, 15, 12, 8, 6, 32 };

		int inputnumber = 26;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == inputnumber)
					System.out.println(inputnumber);

			}

		}

	}
}