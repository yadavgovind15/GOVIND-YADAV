package com.techlab;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Logfile {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Govind\\Desktop\\Demo1.txt");
		Scanner sc=new Scanner(f);
		//System.out.println(args.length);
		while(sc.hasNextLine()) {
			String str=sc.nextLine(); 
			//String[] str1=str.split(" - ");
			if(str.contains(args[0])) {
				System.out.println(str);
			}
		}
		
	}

}
