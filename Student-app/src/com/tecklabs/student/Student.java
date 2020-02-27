package com.tecklabs.student;

public class Student {
	public int id;
    public String name;
	 public String address;
   public  String college;

	 public Student(int i, String name, String address, String college) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.college = college;
	}

public void display() {
		System.out.println(id + " " + name + " " + address + " " + college);
	}
}
