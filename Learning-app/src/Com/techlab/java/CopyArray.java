package Com.techlab.java;

public class CopyArray {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i] = a[i];
			}
			System.out.print(b[i]);
		}
	}
}