package Com.techlab.java;

public class SubstringWithoutInbuilt {
	public static void main(String[] args) {
		String s1 = " mynameisgovind";
		String s2 = " name";
		char c;
		char d;
		int count = 0;
		boolean match = true;
		for (int i = 0; i < s1.length(); i++) {
			c = s1.charAt(i);
			for (int j = 0; j < s2.length(); j++) {
				d = s2.charAt(j);
				if (c == d) {
					match = true;
					count++;
					if (count == s2.length()) {
						i = s1.length();
						break;
					}
					i++;
					c = s1.charAt(i);
		
				} else {
					match = false;
				}
			}
			
		}

		if (match == true) {
			System.out.println("s2 is a part of s1 ");
		}

	}
}