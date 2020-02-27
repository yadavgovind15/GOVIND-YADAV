package com.techlab.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadInfo{
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Govind\\Desktop\\Demo1.txt");

		String str = new String();

		for (int i = 0; i < fr.read(); i++) {

			int v = fr.read();

			if (v != -1) {
				str = str + (char) v;

			}
		}
		String[] str2 = str.split("-");
		if (str2[1].contains("WARNING")) {
			System.out.print(str + " ");
		}
			fr.close();

		}
	}

