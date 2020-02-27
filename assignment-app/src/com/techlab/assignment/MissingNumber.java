package com.techlab.assignment;

public class MissingNumber {
public static void main(String[] args) {
	int num[]= {1,2,4,5,6,7,8};
	int totalnumber=num.length+1;
	int number=(totalnumber*(totalnumber+1)/2);
	int numbersum=0;
	for(int i=0;i<num.length;i++) {
	numbersum =numbersum+num[i];	
	}
	System.out.println(number-numbersum);
}
}
