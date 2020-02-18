package com.techlab.assignment;

public class StringArrayTest {
	public static void main(String[] args) {
		String[] arr = { "Govind","Mahendrabahubali" ,"Niranjan", " Ketan", "Vickey", "Ramesh","Mom" ,};
		String largest = arr[0];
		String small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > largest.length())
				largest = arr[i];

		}
		System.out.println(largest);

		for (int j = 0; j < arr.length; j++) {
			if (small.length() > arr[j].length())
				small = arr[j];
		}
		System.out.println(small);
	}

}
