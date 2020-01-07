package com.techlab.variabledemo;

import javax.management.Query;

public class subsringarrays {
	public static void main(String[] args) {
		String query = "https:// www.swabhavtechlab.com@developers.java";
		System.out.println(query.substring(13, 26));
		String query1 = "https:// www.swabhavtechlab.com@developers.java";
		String[] str = query1.split("[. , @]");
		System.out.println(str.length);

		System.out.println("course name is :" + str[0]);

		System.out.println("course name is :" + str[1]);

		System.out.println("course name is :" + str[2]);

		System.out.println("course name is :" + str[3]);

		System.out.println("course name is :" + str[4]);

		System.out.println("course name is :" + str[5]);
		

	}

}
