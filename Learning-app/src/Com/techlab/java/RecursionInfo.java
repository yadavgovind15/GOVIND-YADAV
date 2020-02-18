package Com.techlab.java;

public class RecursionInfo {
	public static void main(String[] args) {
		printinfo();

	}

	static void printinfo() {
		System.out.println("printing information");
		printinfo();
	}
}
