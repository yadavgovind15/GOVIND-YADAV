package com.techlab.java;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
	r1.changeHeight(20);
	r1.changeWidth(20);
	
	
	System.out.println(r1.readHeight());
	System.out.println(r1.readWidth());
	
	System.out.println(r1.checkHeight());
	System.out.println(r1.checkWidth());
	
	System.out.println(r1.calculateArea());
}
}