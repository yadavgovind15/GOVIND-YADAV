package Com.techlab.java;

public class ArraySplit {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 7, 1, 9, 11, 6 };
		int alen = a.length;
		
		System.out.print("\n first array");
		for (int i = 0; i < alen / 2; i++) {
			System.out.print("  " + a[i]);
		}
		  
		System.out.print("\n second array ");
		for (int i = (alen / 2); i < alen; i++) {
			System.out.print("  " + a[i]);
		}
	}
}
