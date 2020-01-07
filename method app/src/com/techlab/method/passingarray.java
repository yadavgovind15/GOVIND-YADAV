package com.techlab.method;

public class passingarray {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40 };
		for(int j=0;j<4;j++)
			System.out.println(arr[j]);
		System.out.println(mutable(arr));
	}

	static int mutable(int [] a) {
		int sum=0;
		for (int i = 0; i < 4; i++) {
			//stem.out.println(a[i]);
			sum=sum+a[i];
		}
		return sum;
	} 

}
