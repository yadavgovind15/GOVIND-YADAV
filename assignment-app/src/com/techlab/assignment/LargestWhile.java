package com.techlab.assignment;

public class LargestWhile {
	public static void main(String[] args) {
		int arr[] = { 20, 12, 13, 30, 45, 48, 11 };
		int largest = 0;
		int i = 0;
		while (i < arr.length) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
			i++;
		}
		System.out.println(largest);
	}
}
