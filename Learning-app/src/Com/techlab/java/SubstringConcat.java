package Com.techlab.java;

public class SubstringConcat {
	public static void main(String[] args) {
		String query1 = "https://Swabhavtechlab.com";
		String query2 = "www.google.com?india";

		System.out.println(query1.substring(8, 22));
		System.out.println(query2.substring(4, 10));

		String str1 = query1.substring(8, 22);
		String str2 = query2.substring(4, 10);

		System.out.println(str1.concat(str2));
		System.out.println(str2.concat(str1));

		System.out.println(str1.replaceFirst(str1, str2));
		System.out.println(query1.replaceFirst("//", "@"));

		String str3 = "ketan is a nice boy";
		System.out.println(str3.replaceFirst("is", "@"));

		String str4 = "Ketan and Govind are Friends";
		System.out.println(str4.replace("are", "?"));

		String str5 = "@GOVIND IS";

		System.out.println(str5.compareToIgnoreCase("rovind"));

		System.out.println(str5.startsWith("@"));
		System.out.println(str5.endsWith("D"));

		System.out.println(str5.startsWith("G", 1));
		System.out.println(str3.endsWith("boy"));

		System.out.println(str4.endsWith("and"));
		System.out.println(str4.startsWith("Ketan", 0));
	}
}
