package com.techlab.constructor;

public class Customer {
	public int id;
	public String name;
	public String address;

	public Customer() {
		id = 101;
	}

	//public Customer(int newid, String newname, String newaddress) {
		//id = newid;
		//name = newname;
		//address = newaddress;

	//}

	public void display() {
		System.out.println("id is:- " + id + " name is :-" + name + " address is :-" + address);
	}

}
