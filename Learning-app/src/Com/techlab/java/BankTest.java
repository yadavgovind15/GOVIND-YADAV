package Com.techlab.java;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		display();
	}
	static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println(("Enter User Account Number"));

		int AccountNumber = sc.nextInt();
		System.out.println(("Enter User Acoount Holder Name: "));
		String AccountHoldername = sc.next();
		
		System.out.println(("Enter User Bank Name"));
		String Bankname = sc.next();

		System.out.println(("Enter User Amount"));
		double Amount = sc.nextDouble();

		System.out.println(("Account number: " + AccountNumber + "Holder Name:" + AccountHoldername + "Bank Name:"
				+ Bankname + "Amount:" + Amount));
	}
}
