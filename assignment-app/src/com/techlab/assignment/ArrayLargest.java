package com.techlab.assignment;

public class ArrayLargest {
	public static void main(String[] args) {
		int arr[] = { 20, 12, 13, 30, 45, 89, 90, 11 };
		// int largest = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] <arr[j]) {
					temp=arr[i];
					arr[i] = arr[j];
					temp = arr[j];

				}
			}
		}

		System.out.println(" Largest Number Is :-"+ temp);

 	}
}
