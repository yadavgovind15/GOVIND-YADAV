package com.techlab.variable;

public class countevenodd {
	public static void main(String[] args) {
		int a[] = { 10, 8, 9, 7, 6, 50, 2, 110,90 };
		int evencount=0;  
		int oddcount=0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}

		}
		System.out.println("even number" + evencount);
		System.out.println("odd number" + oddcount);

	}

}
