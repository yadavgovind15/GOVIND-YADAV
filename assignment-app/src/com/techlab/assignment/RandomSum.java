package com.techlab.assignment;

import java.util.Random;
import java.util.Scanner;

public class RandomSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		int firstnumber = sc.nextInt();

		System.out.println("Enter Second Number");
		int secondnumber = sc.nextInt();
		int sum = firstnumber + secondnumber;

		Random num = new Random();
		int number = num.nextInt(10);
		System.out.println(" num=" + number);

		boolean add = (sum == number);

		System.out.println(add);
	}
}
