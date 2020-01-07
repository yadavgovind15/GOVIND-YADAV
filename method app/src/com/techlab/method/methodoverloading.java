package com.techlab.method;

public class methodoverloading {
	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}  
	}  
	class TestOverloading1{  
	public static void main(String[] args, methodoverloading Adder){  
	System.out.println(Adder.add(11,11));  
	System.out.println(Adder.add(11,11,11));  
	} 

}
