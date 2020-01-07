package com.techlab.variable;

import java.util.Arrays;

public class sortarray {
	public static void main(String[] args) {
		char a[] = { 'A', 'c', 'a', 'c', 'c' };
		int count = 0;
		char x = 'A';
		for (int j = 0; j < 5; j++) {
			Arrays.sort(a);
			if (x == a[j]) {
				count++;

			} 

		}
		
			
			System.out.println(count);
		
	}
}
//*