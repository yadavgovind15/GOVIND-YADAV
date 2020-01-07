package com.techlab.variabledemo;

public class Fibdemo {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum, i,n=6;
		System.out.print(n1 +  " "+n2); 
		for (i = 0; i <6; i++) 
		{
			sum = n1 + n2;//0+1=1
			n1 = n2;//n1=1
			n2 = sum;//n2=1
			System.out.print( " "+sum);

		}

	}

}
