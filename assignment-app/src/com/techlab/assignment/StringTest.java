package com.techlab.assignment;

public class StringTest {
	public static void main(String[] args) {
		char ch = 'A';
		char c = 'B';
		int valueascii = (int) ch;
		int costascii = (int) c;
		int result = valueascii + costascii;
	System.out.println("Ascii value of A="+valueascii);
	System.out.println("Ascii value of B="+costascii);
		System.out.println(valueascii + costascii);
		if (result % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}

}
