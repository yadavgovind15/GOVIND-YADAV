package Com.techlab.java;

public class SegregateElement {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0 };
		int arr[]= {12,0,7,0,8,0,3};
		int n = arr.length;
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				count++;
		}
		for (int i = 0; i < count; i++)
			arr[i] = 0;
		for (int i = count; i < n; i++)
			arr[i] = 1;

		System.out.print("Array after segregation is = ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
