package com.techlab.assignment;

public class DuplicateRemoveInArray {
	public static void main(String[] args) {
		int arr[]= {1,2,1,6,6,8,5,9,1};
		int count;
		for(int i=0;i<arr.length;i++) { 
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]&& i!=j ){
				
						count++;
					}
				}
				if(count==0)
					System.out.print(arr[i]+" ");
			}
		}
	}


