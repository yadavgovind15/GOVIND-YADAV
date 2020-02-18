package com.techlab.assignment;

import java.util.Scanner;

public class Stringvoweltest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String nw = "";
		String s;
		int i = 0;
		s = sc.nextLine();
		for (i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' || ch1 == 'A' || ch1 == 'E'
					|| ch1 == 'I' || ch1 == 'O' || ch1 == 'U') {
				if (ch1 != ' ') {
					// nw = nw + ch1;
					s = s.replace(ch1, ' ');
					System.out.println(ch1);

				}
			}

		}
	}
}
