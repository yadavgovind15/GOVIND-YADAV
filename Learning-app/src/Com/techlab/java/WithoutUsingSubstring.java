package Com.techlab.java;

public class WithoutUsingSubstring {
	public static void main(String[] args) {
		String s1 = "swabhavtechlab";
		String s2 = "techlab";
		int len1=s1.length();
		int len2=s2.length();
		if(len1==len2) {
		for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) !=s2.charAt(i)) {    
				}
			}

		}
		System.out.println(s1+"="+s2);
	}

}
