package Com.techlab.java;

public class StringConcat {

public static void main(String[] args) {
	String str1="GOVIND";
	String str2="YADAV";
	String str3="Hello this is govind yadav";
	String str4=" I am Learing JAVA";
	System.out.println("Full Name Of "+str1.concat (str2));
	System.out.println(str3.concat(str4));
	System.out.println(str1.replace('G', 'D'));
	System.out.println(str1.replaceAll(str1, str2));
}
}
