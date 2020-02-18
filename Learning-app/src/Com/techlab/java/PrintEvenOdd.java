package Com.techlab.java;

public class PrintEvenOdd {
public static void main(String[] args) {
	int a[]= {10,2,3,5,7,8,9,12};
	System.out.print("\n print even number");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
		System.out.print(" " +a[i]);
		}
	}
	System.out.print("\n print odd number");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) {
		System.out.print(" " +a[i]);
		}
	}
}
}
