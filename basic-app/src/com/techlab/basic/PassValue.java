package com.techlab.basic;

public class PassValue {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		int no = 10;
		mutableArray(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		mutableValue(no);
		System.out.println(no);
	}

	static void mutableArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;

		}

}

	static void mutableValue(int no) {
		// System.out.println(no);

	}

}