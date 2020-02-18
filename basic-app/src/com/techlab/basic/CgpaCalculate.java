package com.techlab.basic;

import java.util.Scanner;

public class CgpaCalculate {
	public static void main(String args[]) {
		int markArray[] = new int[6];
		int i;
		double sum = 0;
		double average, percentage;
		double cgpa;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks for 5 Subjects : ");
		for (i = 0; i < 6; i++) {
			markArray[i] = sc.nextInt();
			sum = sum + markArray[i];
		}

		average = sum / 6;
		percentage = (sum / 600) * 100;
		cgpa = (percentage / 9.5);

		System.out.print("Average Marks = " + average);

		System.out.println(" ");
		System.out.print("Percentage = " + percentage + "%");

		System.out.println(" ");
		System.out.print("cgpa= " + cgpa);
	}
}
