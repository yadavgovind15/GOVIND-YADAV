package com.techlab.variable;

import java.util.Arrays;

public class copyitratingarray {
	public static void main(String[] args) {
		int my_array[] = { 10, 8, 12, 14, 7, 6, 9, 4, 3, 1 };
		int new_array[] = new int {5,8,6,9,1,4,2,7,3,5,8,9};
		System.out.println("source arrays:" + Arrays.toString(my_array));
		for (int i = 0; i < 0; i++)

		{
			new_array[i] = my_array[i];
		}
		System.out.println("new array:" + Arrays.toString(my_array));

	}

}