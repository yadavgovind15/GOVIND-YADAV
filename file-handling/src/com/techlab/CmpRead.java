package com.techlab;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class CmpRead {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(("C:\\Users\\Govind\\Documents\\Swabhavtechlab\\FileHandling-app\\cmt.txt"));
		String str = new String();

		for (int i = 0; i <100 ; i++) {
			int v = fr.read();

			if (v != -1) {
				str = str + (char) v;

			}
		}
		String[] str2 = str.split(",");
		for (int i = 0; i < str2.length; i++) {

			System.out.print(str2[i] + " ");
//		BufferedReader fr = new BufferedReader(
//				new FileReader("C:\\Users\\Govind\\Documents\\Swabhavtechlab\\FileHandling-app\\cmt.txt"));
//		String str = new String();
//		while ((str = fr.readLine()) != null) {
//			
//			String[] str2 = str.split(",");
//			System.out.println(str  );

		}
		fr.close();

	}
}