package com.techlab.variable;

import java.util.Arrays;

public class reversenb {
	public static void main(String[] args) {
		int a[] = { 10, 11, 62, 39 };
		Arrays.sort(a);
		for (int i = (a.length) - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		/*
		 * for( int i=0;i<0;i++) { System.out.println(); System.out.println(a[i] ); }
		 * for(int i=3;i<0;i--) { System.out.println(a[i]);
		 * 
		 * 
		 * }
		 */
	}
}
