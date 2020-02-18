package com.techlab.assignment;

public class StringTestVowel2 {
	public static void main(String[] args) {
	String name= "Govind Yadav Ketan and Vickey";
	 for(int i=0; i<name.length(); i++) {
	      
	      if(name.charAt(i)== 'a'|| name.charAt(i) == 'e'|| name.charAt(i) == 'i' ||
	         name.charAt(i) == 'o' || name.charAt(i) == 'u'|| name.charAt(i) == ' ') {
	         } else {
	            System.out.println("Given string contains "+name.charAt(i)+" at the index "+i);
	         }
	      }
	
	}

}
