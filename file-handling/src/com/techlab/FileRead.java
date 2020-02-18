 package com.techlab;

import java.io.FileReader;

public class FileRead {

	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Govind\\Desktop\\demo.txt");

		String str = new String();

		for (int i = 0; i <15 ; i++) {
			int v = fr.read();

			if (v != -1) {
				str = str + (char) v;

			}
		}
		String[] str2 = str.split(",");
		for (int i = 0; i < str2.length; i++) {

			System.out.print(str2[i] + " ");
		}

		fr.close();

	}
}
