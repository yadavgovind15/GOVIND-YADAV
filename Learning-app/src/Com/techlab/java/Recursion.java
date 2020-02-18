package Com.techlab.java;

public class Recursion {
public static void main(String[] args) {

sum(10,20);

}
	static void sum(int a,int b) {
	 int sum=a+b;
	 sum(10,20);
	 System.out.println(sum);
	}

}

