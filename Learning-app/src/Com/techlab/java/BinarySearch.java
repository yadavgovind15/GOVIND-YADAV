package Com.techlab.java;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { -20, 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		int first = 0;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}
}