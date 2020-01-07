package com.techlab.variable;

public class averageall {
	public static void main( String[] args)
	{
		int a[]= {10,20,30,43,51};
		double sum=0;
		double average=0.;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
			 average= sum/5;
		}
		System.out.println( sum);
		System.out.println ("average" +average);
		
	}

}
