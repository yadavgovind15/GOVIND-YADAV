package com.techlab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWrite {
	public static void main(String[] args) throws Exception {

		// File f = new File("C:\\Users\\Govind\\Desktop\\demo.txt");
		//Scanner sc = new Scanner(f);
		//System.out.println(sc.nextLine());
		FileWriter fw = new FileWriter("C:\\Users\\Govind\\Desktop\\demo.txt");
		String str=" I am learing java at swabhav techlab"+" i have completed basic concept";
		fw.write("govind yadav");
		fw.write(str);
		//sc.close();
		fw.close();
		FileReader fr=new FileReader("C:\\Users\\Govind\\Desktop\\demo.txt");
		 int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();    
	}
}
