package com.techlab.assignment;

public class Stringtest2 {
	public static void main(String[] args) {
		String str = "govind@ketan@vickey@ram";
		maxLengthString(str);
		minLengthString(str);
	}

	static void maxLengthString(String str) {
		String[] str2 = str.split("@");
		String max = str2[0];

		for (int i = 0; i < str2.length; i++) {
			if (str2[i].length() > max.length()) {

				max = str2[i];

			}

		}

		System.out.println("Maximum length:=" + max.length());
	}

	static void minLengthString(String str) {
		String[] str2 = str.split("@");
		String min = str2[0];

		for (int i = 0; i < str2.length; i++) {
			if (str2[i].length() < min.length()) {

				min = str2[i];

			}

		}

		System.out.println("Minimum length:=" + min.length());
	}
}