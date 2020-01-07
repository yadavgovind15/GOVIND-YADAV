package com.techlab.variabledemo;

public class SwappingWithoutTemp {
	public static void main(String[] args) {
		int a = 10, b = 5;
		a = a - b; // 5
		b = a + b;// 10
		System.out.println("value of a : " + a + " value of b: " + b);

	}
}
