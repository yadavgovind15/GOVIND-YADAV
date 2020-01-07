package com.techlab.variabledemo;

public class logical1 {
	public static void main (String[] args)
	{
		int a=5,b=9,c=7;
		if(a>b && a>c) //logical operator 
		{
			System.out.println("a is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest");
			
		}
		else
		{
			System.out.println("c is largest");
		}
	}

}
