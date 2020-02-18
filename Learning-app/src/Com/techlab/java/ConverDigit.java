package Com.techlab.java;

public class ConverDigit {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 46, 100, 300, 8, 90, 600, 20, 30 };
		int arra[] = new int[arr.length];
		int j = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 99 && arr[i] > 9) {
				arra[j] = arr[i];
				j++;
			}
		}
		for (int k = 0; k < arra.length - 5; k++) {
			System.out.println(arra[k] + 1);

		}
		System.out.println("\n assending order");
		for (int k = 0; k < arr.length; k++) {
			for (int l = k + 1; l < arr.length; l++) {
				if (arr[k] > arr[l]) {
					temp = arr[k];
					arr[k] = arr[l];
					arr[l] = temp;

				}
			}
			System.out.print(" " + arr[k]);
		}

	}

}
