package com.techlab.assignment;

public class SeparetwZero {
public static void main(String[] args) {
	int arr[]= {12,0,7,0,8,0,3};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0 ){
			System.out.println(arr[i]);
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==0 ){
			System.out.println(arr[i]);
}
}
}
}