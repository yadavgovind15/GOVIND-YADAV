package Com.techlab.java;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Random a = new Random();
		int Randoma = a.nextInt(20);
		int guess;
		int count = 0;

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("guess number betwwen(0w -20)");
			guess = sc.nextInt();

			if (guess == Randoma) {

				System.out.println("Your guess is correct Congratulations!");
				count++;
			}

			else if (guess < Randoma) {

				System.out.println("Your guess is smaller than the number.");
				count++;
			} else if (guess > Randoma) {

				System.out.println("Your guess is greater than the  number.");
				count++;
			}
		} while (guess != Randoma);

		System.out.println("your guess was " + Randoma);
		System.out.println("number are trials are:" + count);
	}

}
