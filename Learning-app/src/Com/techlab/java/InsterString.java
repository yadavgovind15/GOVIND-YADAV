package Com.techlab.java;

public class InsterString {
	public static void main(String[] args) {
		String a = "Ramesh a good boy";
		String b = "is";

		String c = a.substring(7, 17);

		String d = a.substring(0, 6);

		System.out.println(d.concat(" ") + b.concat(c));

	}

}