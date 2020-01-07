package com.techlab.variabledemo;

public class Pattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j );
			}
			System.out.println();
		}
		
		
		/*
		 * Pattern Program
		 */		
		int a=0;
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<=row;col++) {
				a=a+1; //a++
				System.out.print(a);
			}
			System.out.println();
		}

	}
}
