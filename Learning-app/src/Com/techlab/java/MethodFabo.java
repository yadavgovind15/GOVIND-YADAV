package Com.techlab.java;

public class MethodFabo {
	public static void main(String[] args) {
		fabonic(5);
	}

	static void fabonic(int n) {
		int fabonic;
		int n1 = 0, n2 = 1;
		System.out.print(n1 + "" + n2);
		for (int i = 0; i < n; i++) {
			fabonic = n1 + n2;
			System.out.print( fabonic);
			n1 = n2;
			n2 = fabonic;
		}

	}
}