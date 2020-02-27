package com.techlab.dog.txt;

import com.techlab.dog.chap1.Dog;

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.size=20;
		System.out.println("size is "+d.size);
		d.eat();
		d.chaseCat();
		d.bark();

	}	

}
