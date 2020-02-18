package Com.techlab.java;

import java.util.Random;
import java.util.Scanner;

public class MenuMedhod {
	public static void main(String[] args) {
		display();
	}

	public static void start() {
		int count = 0;

		Random num = new Random();
		int number = num.nextInt(10);

		Scanner sc = new Scanner(System.in);
		while (number > 0) {

			System.out.println("Guess a number : ");
			int guess = sc.nextInt();

			if (guess == number) {
				System.out.println(" SUCCESS ");
				break;
			}

			else if (guess > number) {
				System.out.println("Guess is high");
			}

			if (guess < number) {
				System.out.println("Guess is low");
			}
			count++;
		}

		System.out.println("Generated Number is : " + number);
		System.out.println("Number of Guess = " + count);
		restart();
	}

	public static void restart() {
		int restart;

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to restart ? yes or no ");

		restart = sc.nextInt();

		if (restart == 1) {
			start();

		} else
			exit();
		System.out.println(" Game Over ");
	}

	public static void exit() {
		int option = 0;
		if (option == 2) {

		}
	}

	public static void display() {
		int choice;
		Scanner sc = new Scanner(System.in);

		System.out.println("Select option : 1.start or 2.restart or 3.exit ");
		choice = sc.nextInt();

		do {
			switch (choice) {
			case 1:
				start();
				break;

			case 2:
				restart();
				break;

			default:
				System.out.println("plese enter valid choice");
				break;
			}
		} while (choice != 3);

	}

}
