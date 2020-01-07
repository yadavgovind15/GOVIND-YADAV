package Com.techlab.java;

public class PalindroneNumber {
	public static void main(String[] args) {
		int n=121,j=n;
		int a,rev=0;
		while(n!=0) {
			a=n%10;
			rev=rev*10+a;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==j) {
			System.out.println("number is palindrone ");
		}
		else {
			System.out.println("number is not palindrone");
		}
		
		
	}

}
