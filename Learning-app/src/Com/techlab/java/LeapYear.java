package Com.techlab.java;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2020;
		boolean leap = false;

		if ((year % 4 == 0) || (year % 100 == 0) && (year % 400 == 0)) {

			leap = true;
		}

		else
			leap = false;

		if (leap ) {
			System.out.println(year + " is a leap year");

		} else
			System.out.println(year + " is not a leap year");
	}
}
