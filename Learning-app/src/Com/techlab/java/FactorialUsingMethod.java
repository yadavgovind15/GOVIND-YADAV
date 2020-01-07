package Com.techlab.java;

public class FactorialUsingMethod {
	public static void main(String[] args) {
		factorial(5);
	}

	static void factorial(int n) {
		int factorial = 1, i;
		for (i = 1; i <= n; i++) {
			factorial = factorial * i;

		}
		System.out.println(factorial);

	}
}
