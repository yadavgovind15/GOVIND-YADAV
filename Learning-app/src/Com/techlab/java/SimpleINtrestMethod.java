package Com.techlab.java;

import java.util.Scanner;

public class SimpleINtrestMethod {
	static final double RATE_OF_INTEREST = 0.05;
	public static void main(String[] args) {
		intrestRateUpToFive(5000, 2);
		intrestRateAboveFive(10000, 6);
		intrestRateAboveTen(15000, 11);
	}

	public static void intrestRateUpToFive(double p, double t) {
		if (t > 0 && t < 5) {
			double SI = (p * RATE_OF_INTEREST * t);
			System.out.println(SI);
		}
	}

	public static void intrestRateAboveFive(double p, double t) {
		if (t > 5 && t < 10) {
			double rateofintrest = 2 * RATE_OF_INTEREST;
			double SI = (p * rateofintrest * t);
			System.out.println(SI);
		}
	}

	public static void intrestRateAboveTen(double p, double t) {
		if (t > 10) {
			double rateofintrest = 3 * RATE_OF_INTEREST;
			double SI = (p * rateofintrest * t);
			System.out.println(SI);
		}
	}
}