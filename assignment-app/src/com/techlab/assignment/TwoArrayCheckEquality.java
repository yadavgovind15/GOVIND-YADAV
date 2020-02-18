package com.techlab.assignment;

import java.util.Arrays;

public class TwoArrayCheckEquality {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 6, 2, 6, 8, 5, 9, 1 };
		int arr1[] = { 1, 2, 1, 6, 2, 6, 8, 5, 9, 1 };
		boolean number = Arrays.equals(arr, arr1);
		if (number == true) {

			System.out.println("Array are Equal");
		} else {
			System.out.println("Array are Not Equal");

		}

	}

}