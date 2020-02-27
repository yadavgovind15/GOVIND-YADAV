package com.techlab;

public class Chapter2Test {
	public static void main(String[] args) {
		Chapter2 d = new Chapter2();
		d.playSnare();
		d.snare = true;
		d.playTopHat();
		if (d.snare == true) {
			d.playSnare();
		}
	}
}
