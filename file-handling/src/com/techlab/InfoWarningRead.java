package com.techlab;

import java.io.FileReader;

public class InfoWarningRead {
	    public static void main(String args[])throws Exception{    
	          FileReader fr=new FileReader("C:\\Users\\Govind\\Desktop\\Demo1.txt");    
	            fr.read(); 
	          fr.close();    
	    }    
}
