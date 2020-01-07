 package Com.techlab.java;

public class StringCompare {
	public static void main(String[] args) {

		String str1 = "geekta";
		
		String str2 = "geeks";
		compare(str1, str2);
	}
	
	static void compare(String str1, String str2) {
		char[] v1 = str1.toCharArray();
		char[] v2 = str2.toCharArray();
		int k = 0;
		while (k < str1.length()) {
			char c1 = v1[k];
			char c2 = v2[k];
			if (c1 == c2) {
				k++;
				} else if (c1 > c2) {
					k++;
				}
			if (c1 < c2) {
				k++;
			}

			System.out.println(c1 - c2);
		}
	}
}
