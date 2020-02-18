package Com.techlab.java;

public class LargestTwo {
	public static void main(String[] args) {
		int a[] = { 11, 5, 6, 9, 15, 60, 80,90 };
		int firstlargest = 0, secondlargest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = a[i];
			} else if (a[i] > secondlargest && a[i] != firstlargest) {
				secondlargest = a[i];

			}
		}

		System.out.println(" First Largest=" +firstlargest);
		System.out.println(" Second largest="+secondlargest);

	}
}
