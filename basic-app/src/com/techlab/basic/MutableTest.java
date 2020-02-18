package com.techlab.basic;

public class MutableTest {
	public static void main(String[] args) {

		String str1 = "Govind";
		String str2 = "ketan";
		System.out.println(str1 == str2);

		System.out.println(str1.equals(str2));
		
		String temp = str2;
		System.out.println(str2 == temp);
		System.out.println(str1 == temp);
		System.out.println(temp.hashCode());
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

	}
}
