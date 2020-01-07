package com.techlab.variabledemo;

public class IncrementDemo1 {
	public static void main(String[] args) {
		int z = 10, i = 6;
		z = ++i + i++;
		System.out.println("value of z" + z);
	}

}
