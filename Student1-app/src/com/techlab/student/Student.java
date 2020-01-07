package com.techlab.student;

public class Student {
	private int id;
	private String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	void display() {
		System.out.println("id is:" + id + "name is:" + name);
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "govind");
		s1.display();
	}

}
