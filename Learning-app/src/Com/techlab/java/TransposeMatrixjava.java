package Com.techlab.java;
public class TransposeMatrixjava {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 1}, { 2, 3, 2}, { 3, 4, 5} };
		int b[][] = new int[3][3], i, j;
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				b[i][j] = a[j][i];
		System.out.println("\n original  matrix is");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("\n After Transpose  matrix is");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}
