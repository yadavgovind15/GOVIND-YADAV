package com.techlab.variable;

public class twodiam {
	public static void main(String[] args) {
		int studentmarks[][]; // declaration
		studentmarks = new int[2][2];
		// init   
		studentmarks[0][0] = 40;
		studentmarks[0][1] = 20;
		studentmarks[1][0] = 30;
		studentmarks[1][1] = 50;

		System.out.println(studentmarks[0][0]);
		System.out.println(studentmarks[0][1]);
		System.out.println(studentmarks[1][0]);
		System.out.println(studentmarks[1][1]);

	}

}
