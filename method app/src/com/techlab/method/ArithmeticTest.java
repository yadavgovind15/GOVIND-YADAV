package com.techlab.method;

public class ArithmeticTest {
	public static void main(String[] args) {

		System.out.println(add(10, 20));
		System.out.println(sub(55, 35));

	}

	static int add(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}

	static int sub(int a, int b) {
		int sub;
		sub = a - b;
		return sub;
	}

}
