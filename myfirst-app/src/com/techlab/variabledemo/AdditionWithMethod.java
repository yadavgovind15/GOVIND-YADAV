package com.techlab.variabledemo;

public class AdditionWithMethod {
	public static void main(String[] args) {
		int s = mul(12, 8);
		System.out.println(s);
	}

	static int mul(int a, int b) {
		int mul;
		mul = a * b;
		return mul;
	}

}
