package com.techlab;

import java.util.Random;
import java.util.Scanner;

public class SwitchEvenOdd {
	static final int EVENODD = 1;
	static final int FACTORIAL = 2;
	static final int FIBONACCI=3;
	static final int LEAPYEAR=4;
public static void main(String[] args) {
	display();
}
 public static void evenodd() {
	Random num = new Random();
	int number = num.nextInt();
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number even or odd : ");
	int guess = sc.nextInt();
	if (number%2==0)
	{
		System.out.println("number is even");   
	}
	else
		System.out.println("number is odd");
	}
 public static void  factorial() {
	Random num = new Random();
	int number = num.nextInt();
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number factorial : ");
	int guess = sc.nextInt();
	int i,fact=1;
	for(i=1;i<=guess;i++)
	{
		fact=fact*i;
	}
		System.out.println(fact);
	
	}
static void fibonacci() {
	Random num = new Random();
	int number = num.nextInt(15);
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a number : ");
	int guess = sc.nextInt();
	int n1 = 0, n2 = 1, sum, i;
	System.out.print(n1 +  " "+n2); 
	for (i = 0; i <guess; i++) 
	{
		sum = n1 + n2;
		n1 = n2;
		n2 = sum;
		System.out.print( " "+sum);

	}
}
 public static void leapyear() {
	Random year1= new Random();
	int year=year1.nextInt();
	Scanner sc = new Scanner(System.in);
	System.out.println("Guess a year  : ");
	int guess = sc.nextInt();
	boolean leap = false;

	if ((guess % 4 == 0) || (guess% 100 == 0) && (guess % 400 == 0)) {

		leap = true;
	}

	else
		leap = false;

	if (leap ) {
		System.out.println(guess + " is a leap year");

	} else
		System.out.println(guess+ " is not a leap year");
}
 public static void display() {
		int option;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select option : 1.evenodd or 2.factorial or 3.fibonacci or 4.leapyear ");
		option = sc.nextInt();
		switch (option) {
		
		case EVENODD:
			evenodd();
			break;
			
		case FACTORIAL:
			factorial();
			break;
			
		case FIBONACCI:
			fibonacci();
			break;
			
		case LEAPYEAR:
			leapyear();
			break;
			
		default:
			System.out.println("Select valid option");
			break;

		}
	}
	
}




