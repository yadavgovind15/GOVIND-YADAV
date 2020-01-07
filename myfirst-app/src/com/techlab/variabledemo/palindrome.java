package com.techlab.variabledemo;

public class palindrome {
	public static void main(String[] args) {
		int n = 1234, a, reverse = 0 ;
		 
		while (n > 0) {
			a = n % 10;
			reverse = reverse * 10 + a;
			n = n / 10;
		}
		
		System.out.println(reverse);

		if (reverse == n)
		
			System.out.println( "number is palindrome");
		else
			System.out.println("number is not palindrome");
		
	}

}
