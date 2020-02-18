package com.techlab;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws Exception {
		char a[] = { 'G', 'O', 'V', 'I','N','D' };
		FileWriter fw = new FileWriter("C:\\Users\\Govind\\Desktop\\demo.txt");
		String str = new String(a);
		String p = str.substring(0, 1);
		String q = str.substring(1, 2);
		String r = str.substring(2, 3);
		String s = str.substring(3, 4);
		String t = str.substring(4, 5);
		String u = str.substring(5, 6);
		String str2 = (p + " " + q + " " + r + " " + s + " "+t+" "+u+" ");
		fw.write(str2);
		System.out.println(str2 + " ");

		fw.close();
	}
}
