package com.techlab.variabledemo;

public class Vowel {
	public static void main(String[] args) {
		int CountConsonant = 0, CountVowel = 0;
		String s = "GOVINDYADAVSAMHAi";
		for (int i = 0; i <s.length();i++) {
			char Character = s.charAt(i);
			if (Character == 'A' || Character == 'E' || Character == 'i' || Character == 'O' || Character == 'U') {
				CountVowel++;

			} else {
				CountConsonant++;

			}
		}

		System.out.println("vowls Count:" +CountVowel );
		System.out.println("consonant Count:" + CountConsonant);

	}
}
