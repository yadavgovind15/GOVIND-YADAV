package com.techlab.assignment;

public class ContinuousSubArray {
	public static void main(String[] args) {
		int arr[] = { 42, 15, 12, 8, 6, 32 };

		int inputnumber = 26;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum=0;
			for (int j = i+1; j < arr.length; j++) {
				sum=sum+arr[j];
				if (sum == inputnumber)
					System.out.println(inputnumber+"\t"+arr[j]);

			}

		}

	}
}