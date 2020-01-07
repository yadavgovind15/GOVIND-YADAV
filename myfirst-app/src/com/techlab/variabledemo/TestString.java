package com.techlab.variabledemo;

public class TestString {
	public static void main(String[] args) {
		String str = "I am learning java in Swabhav Techlab";
		System.out.println("Course name is: " + str.substring(14, 18));
		System.out.println("Comapny name is: " + str.substring(22));

		String str1 = "https://swabhavtechlab.com";
		// System.out.println(str1.split("//"));

		String[] str2 = str1.split("//",2 );

			System.out.println(str2.length);
		System.out.println("Comapny name is: " + str2[1]);

	}
}
