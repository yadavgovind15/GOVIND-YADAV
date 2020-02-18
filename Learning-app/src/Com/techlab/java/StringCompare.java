 package Com.techlab.java;

public class StringCompare {
	public static void main(String[] args) {

		String str1 = "govindaA";
		
		String str2 = "dovindb";
		compare(str1, str2);
	}
	
	static void compare(String str1, String str2) {
		char[] v1 = str1.toCharArray();
		char[] v2 = str2.toCharArray();
		int length = 0;
		if(v1.length >v2.length) {
			length = v2.length; 
		}
		int k = 0;
		while (k < length) {
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
		while( k < v1.length) {
			System.out.println((int)v1[k]);
			k++;
		}
	}
}
