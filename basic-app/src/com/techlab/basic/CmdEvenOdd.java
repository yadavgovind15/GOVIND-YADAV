package com.techlab.basic;

public class CmdEvenOdd {
	public static void main(String[] args) {

		int i = 0;
		if (args[i].contains("even")) {
			for (i = 0; i < args.length - 1; i++) {
				int value = Integer.parseInt(args[i]);
				if (value % 2 == 0) {
					System.out.println(value);

				}
			}
		}

		else if (args[i].contains("odd")) {
			for (i = 0; i < args.length - 1; i++) {
				int value = Integer.parseInt(args[i]);
				if (value % 2 != 0) {
					System.out.println(value);
				}
			}
		} else {
			for (i = 0; i < args.length - 1; i++) {
				int value = Integer.parseInt(args[i]);
				System.out.println(value);
			}
		}
	}

}
