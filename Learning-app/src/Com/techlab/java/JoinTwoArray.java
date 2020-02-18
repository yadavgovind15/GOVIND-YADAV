package Com.techlab.java;

import java.util.Arrays;

public class JoinTwoArray {
	public static void main(String[] args) {
		int[] array1 = { 10, 18, 3, 5, 7 };
		int[] array2 = { 7, 5, 6, 8, 9, 12, 13 };
		int aLen = array1.length;
		int bLen = array2.length;
		int[] result = new int[aLen + bLen];
		for (int i = 0; i < array1.length; i++) {
			result[i+bLen] = array1[i];
		}
		for (int j = 0; j < array2.length; j++) {
			result[aLen + j] = array2[j];
		}

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i]);
		}

		Arrays.sort(result);
		System.out.println(" Assending order " +Arrays.toString(result));
	}
}