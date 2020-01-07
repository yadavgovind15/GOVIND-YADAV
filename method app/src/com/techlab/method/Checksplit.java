package com.techlab.method;

public class Checksplit {
	public static void main(String[] args) {
		String querystring = "Govind@110*swabhavtechlab";
		String []query=querystring.split("[@,*]");
		System.out.println(query.length);
		System.out.println("I AM :" + querystring.substring(0,6));
		System.out.println("my id:" +query[1]);
		System.out.println("my college name is :"+query[2]);
}
}
