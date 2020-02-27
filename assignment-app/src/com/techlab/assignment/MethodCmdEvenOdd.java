package com.techlab.assignment;

public class MethodCmdEvenOdd {
	public static void main(String[] args) {
		printEvenNo(args);
		printOddNo(args);
		printNo(args);
	}

	public static void printEvenNo(String[] args) {
		System.out.println("Inside printEvenNo method");
		int i = 0;
		String type = args[args.length - 1];
		System.out.println("Number Type: " + type);
		if (type.equalsIgnoreCase("even")) {
			for (i = 0; i < args.length - 1; i++) {
				int value = Integer.parseInt(args[i]);
				if (value % 2 == 0) {
					System.out.println(value);

				}

			}
		}
	}
	public static void printOddNo(String[] args) {
		System.out.println("Inside printOddNo method");
		int i = 0;
		String type = args[args.length - 1];
		System.out.println("Number Type: " + type);
		if (type.equalsIgnoreCase("odd")) {
			for (i = 0; i < args.length - 1; i++) {
				int value = Integer.parseInt(args[i]);
				if (value % 2 != 0) {
					System.out.println(value);

				}

			}
		}
	}
	public static void printNo(String[] args) {
		System.out.println("Inside printNo method");
		int i = 0;
		String type = args[args.length - 1];
		System.out.println("Number Type: " + type);
		if (type.equalsIgnoreCase("number")) {
			for (i = 0; i < args.length - 1; i++) {
				int value = Integer.parseInt(args[i]);
				
					System.out.println(value);

				

			}
		}
	}
}
