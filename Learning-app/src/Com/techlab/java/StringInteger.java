package Com.techlab.java;

public class StringInteger {
	public static void main(String[] args) {
		String a = "125";
		String b = "2.23";
		System.out.println("value of double=" + Double.parseDouble(b));
		System.out.println("Value of Integer=" + Integer.parseInt(a));
		System.out.println("Value of Integer=" + Integer.valueOf(a)); 
	}

}
