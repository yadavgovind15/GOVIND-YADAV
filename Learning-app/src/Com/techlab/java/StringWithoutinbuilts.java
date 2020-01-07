package Com.techlab.java;

public class StringWithoutinbuilts {
	public static void main(String[] args) {
		String str = "swabhav//techlab.com";
		str = str.replaceAll("[//,.]", "");

		System.out.println(str);

	}
}
