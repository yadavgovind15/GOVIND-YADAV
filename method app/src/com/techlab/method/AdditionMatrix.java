package com.techlab.method;

public class AdditionMatrix {
	public static void main(String[] args) {
		int a[][] = { { 4, 2 }, { 8, 5 } };
		int b[][] = { { 2, 1 }, { 6, 5 } };
		int sum[][] = new int[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				sum[i][j] = a[i][j] +b[i][j];
				System.out.println(sum[i][j] + " ");
			}
		}
	}

}
