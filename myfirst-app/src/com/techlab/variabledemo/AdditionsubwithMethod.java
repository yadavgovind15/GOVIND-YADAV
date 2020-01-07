package com.techlab.variabledemo;

public class AdditionsubwithMethod {
	public static void main(String[] args) {
		int sm = sum(30, 5);
		System.out.println("add is:" + sm);
		int sb = sub(10, 5);
		System.out.println("sub is:" + sb);
		int ml = mul(6, 5);
		System.out.println("multi is:" + ml);
		int dv = div(10, 2);
		System.out.println("division is :" + dv);
		int md = mod(9, 2);
		System.out.println("module is :" + md);

	}

	static int sum(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}

	static int sub(int c, int d) {
		int sub;
		sub = c - d;
		return sub;
	}

	static int mul(int e, int f) {
		int mul;
		mul = e * f;
		return mul;
	}

	static int div(int g, int h) {
		int div;
		div = g / h;
		return div;
	}

	static int mod(int i, int j) {
		int mod;
		mod = i % j;
		return mod;
	}

}
