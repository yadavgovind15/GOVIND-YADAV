package com.techlab.assignment;

public class MostFrequentElements {
	public static void main(String[] args) {
		int a[] = { 4,5,8,7,4,7,6,7 };
		int count = 0,temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i ; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
				if (temp<count)
					temp= a[i];
			}
		}
		System.out.println("Repeated element is:" + temp );
		System.out.println( " Number of repeated times :"  + count);
	}
}

