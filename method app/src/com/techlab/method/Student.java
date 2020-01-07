package com.techlab.method;

public class Student {

	int id;
	String name;

	public void diplay() {
		System.out.println("id  " + id + " name  " + name);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 101;
		s1.name = "govind";
		s1.diplay();

	}
}
