package com.techlap.employee;

public class Employee {
	public int id;
	public String name;
	public String designation;
	public double basicsalary;
	public double hra;
	public double ta;
	public double da;

	public Employee(int id, String name, String designation, double basicsalary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.basicsalary = basicsalary;
	}

	public double Calculatesalary(double basicsalary) {
		double grosssalary;
		hra = (0.2 * basicsalary);
		da = (0.1 * basicsalary);
		ta = (0.3 * basicsalary);
		grosssalary = hra + da + ta + basicsalary;
		return grosssalary;
	}

	public void display() {
		System.out.println(id + " " + name + " " + designation + " " + Calculatesalary(basicsalary));
	}
}
