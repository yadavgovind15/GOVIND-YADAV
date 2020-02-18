package com.techlab.basic;

import java.util.Scanner;

public class CmdEvenOdd {
	public static void main(String[] args) {
		int num[] = new int[5];
		num[0] = Integer.parseInt(args[0]);
//		num[1] = Integer.parseInt(args[1]);
//		num[2] = Integer.parseInt(args[2]);
//		num[3] = Integer.parseInt(args[3]);
//		num[4] = Integer.parseInt(args[4]);
		System.out.println("Number is Even\n");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("Number is Odd\n");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}
	}
}
