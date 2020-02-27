package com.techlab.java;

public class Rectangle {
	public int width;
	public int height;

	public int calculateArea() {

		int area = width * height;
		return area;
	}
	public int readWidth() {
		 
		 
	return width;
	}
	public int readHeight() {
		 
	return height;
	}

	public void changeHeight(int ht) {
	height=ht;
		}
	public void changeWidth(int wt) {
		width=wt;
			}
	public int checkHeight() {
		if(height<1) {
			height=1;
		
		}
		return height;
	}
	public int checkWidth() {
		if(width<1) {
			width=1;
			System.out.println(width);
		}
		return width;
		
	}
}
