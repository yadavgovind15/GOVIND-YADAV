 


package com.techlab.method;

public class MatrixMultiplication {
public static void main(String[] args) {
	int a[][]={ {2,5},{2,6}};
	int b[][]= {{2,5},{7,4}};
	int mul[][]=new int[2][2];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			
		 mul[i][j]=a[i][j]*b[i][j]	;
			System.out.println(mul[i][j]);
		}
	}
}
}
