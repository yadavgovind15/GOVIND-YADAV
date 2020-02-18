package Com.techlab.java;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {13,03,24,67,35};
		int temp;
		for(int i=0;i<arr.length;i++ ) {
			temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]> temp) {
				arr[j]=arr[j-1];
				j=j-1;
				
			}
			arr[j]=temp;
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}