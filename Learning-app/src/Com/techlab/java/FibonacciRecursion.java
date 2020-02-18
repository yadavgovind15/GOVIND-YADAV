package Com.techlab.java;

public class FibonacciRecursion {
	static int a=0,b=1,c;
public static void main(String[] args) {
	System.out.print(a+" "+b);
	FibonacciRecursion d=new FibonacciRecursion();
	d.printFib(5);
}
		 public  static int printFib(int n)
	
		{
			if(n>=1) {
				c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
				printFib(n-1);
			}
			return n;
		}
}
	