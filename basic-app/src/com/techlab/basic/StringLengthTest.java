package com.techlab.basic;

public class StringLengthTest {
	public static void main(String[] args) {
		String str = "govind ketan vickey ram";
		int index = 10;
		int index1 = 21;
		char ch = 'o';
		System.out.println("Original String = " + str);

		str = str.substring(0, index) + ch + str.substring(index + 1);
		str = str.substring(0, index1) + ch + str.substring(index1 + 1);

		System.out.println("New String = " + str);
		String[] str2 = str.split(" ");
		String max = str2[0];

		for (int i = 0; i < str2.length; i++) {
			if (str2[i].length() > max.length()) {

				max = str2[i];

			}

		}

		System.out.println("Maximum length:=" + max.length());

	}
}