package com.techlab.method;

public class AREAOverloading {
	public static void main(String[] args) {
		System.out.println(area(10));
		System.out.println(area (20,30)); 
		System.out.println(area(10,20,30));
	}

	static double  area(int r) {
		double area = (3.14 * r * r);

		return area;
	} 
	static int area(int l,int b) {
		int area = (l*b);
		return area;
	}
	static double area(int a,int b,int c) {
		double area=(0.5*a*b*c);
		return area;
	}

}
