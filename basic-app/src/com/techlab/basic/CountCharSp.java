package com.techlab.basic;

public class CountCharSp {
	public static void main(String[] args) {
		String str = " I Am Govind  @123@4556";
		int charcount = 0, i;
		int specialcount = 0;
		int spacecount = 0;
		int numcount = 0;

		for (i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && (str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && (str.charAt(i) <= 'z')))) {
				charcount++;

			}

			else if (str.charAt(i) == '@') {
				specialcount++;
			}

			else if (str.charAt(i) == ' ') {
				spacecount++;
			} else {
				numcount++;

			}
		}

		System.out.println("number of Characters is = : " + charcount);
		System.out.println("number of special characters is = : " + specialcount);
		System.out.println("number of spaces is =: " + spacecount);
		System.out.println("number of Integernumbers is =: " + numcount);

	}

}

//if (str.charAt(i) >= '0' && (str.charAt(i) <= '9'))
