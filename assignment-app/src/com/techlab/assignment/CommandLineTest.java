package com.techlab.assignment;

public class CommandLineTest {
	public static void main(String[] args) {
		String str = args[args.length - 1];
		if (str.equalsIgnoreCase("even")) {
			for (int i = 0; i < args.length - 1; i++) {
				int a = Integer.parseInt(args[i]);
				if (a % 2 == 0) {
					System.out.println(a);
				}
			}
		} else if (str.equalsIgnoreCase("odd")) {
			for (int i = 0; i < args.length - 1; i++) {
				int a = Integer.parseInt(args[i]);
				if (a % 2 != 0) {
					System.out.println(a);
				}
			}
		} else {

			for (int i = 0; i < args.length - 1; i++) {
				int a = Integer.parseInt(args[i]);
				System.out.println(a);
			}
			
		}
	}
}