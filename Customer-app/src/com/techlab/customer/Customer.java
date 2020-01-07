package com.techlab.customer;

public class Customer {
	public int id;
	public String name;
	public String address;
	public Customer(int id,String name,String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display() {
		System.out.println("id is:" +id + " name is "+name+ " address is " +address);
	}
}
