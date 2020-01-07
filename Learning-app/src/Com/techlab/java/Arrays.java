package Com.techlab.java;

public class Arrays {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 3 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-3; j++) {
				if (a[i] < a[j]) {
temp=a[i];
a[i]=a[j];
temp=a[j];
				}
			}
		}
		System.out.println(temp);

	}

}
