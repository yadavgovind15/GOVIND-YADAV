package com.techlab.assignment;

public class JoinTwoArray {
	public static void main(String[] args) {
		int sum = 0;
		int array1[] = { 20, 13, 17, 05, 04 };
		int array2[] = { 10, 12, 03, 02, 04 };
		int aLen = array1.length;
		int bLen = array2.length;
		int[] array3 = new int[aLen + bLen];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int j = 0; j < array2.length; j++) {
			array3[aLen + j] = array2[j];
		}

		for (int i = 0; i < array3.length; i++) {

			System.out.print(" "+array3[i]);

		}
		System.out.println(" ");
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] % 2 == 0) {
				System.out.print(" "+array3[i]);

			}
		}
		for (int i = 0; i < array3.length; i++) {
			if (array3[i] % 2 != 0) {
				System.out.print(" "+array3[i]);

			}

		}
	}
}