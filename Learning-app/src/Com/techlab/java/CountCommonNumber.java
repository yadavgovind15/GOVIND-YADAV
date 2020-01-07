package Com.techlab.java;

public class CountCommonNumber {
	public static void main(String[] args) {
		int array1[] = { 1, 3, 5, 7, 9, 12, 16 };
		int array2[] = { 1, 3, 9, 7, 11, 16, 6, 8, 23, 5 };
		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					count++;
					System.out.print(array2[j]);
					System.out.println();
				}
			}
		}
		System.out.println("No Of Repeated Count:-" + count);
	}
}
