package com.techlab.java;

public class Rectangle {
	public int breath;
	public int length;
	public Rectangle (int breath,int length) {
		this.breath=breath;
		this.length=length;
	}
	public void area()
	{
		 int area;
		 area=length*breath;
		 System.out.println(area);
		 
	}
	public void display() {
		area();
	
}
	

}
