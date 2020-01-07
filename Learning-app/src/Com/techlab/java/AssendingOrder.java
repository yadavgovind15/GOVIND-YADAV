package Com.techlab.java;

public class AssendingOrder {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 4, 3, 1 };
		int temp = 0, i, j;
		for (i = 0; i < arr.length; i++)
		{
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] >arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.print( arr [i]);
		}
	}
}
