package com.techlab.variable;

public class StringRepeated {
	public static void main(String[] args) {
		String str = "govindyadaveleven";
		int repeatedcount = 0;
		 int nonrepeatedcount=0;
		char[] a = {  'a','e'  };
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == str.charAt(i)) {
					repeatedcount++;
				}
				else
					nonrepeatedcount=str.length()-a.length;
			}
		}
		System.out.println("repeated "+repeatedcount);
		System.out.println("nonrepeated "+nonrepeatedcount);
	}
}
