package com.techlab.variable;

public class armstrong {
	public static void main(String[] args) {
		int n = 12;
		int temp = n;//temp=12//temp==n
		int r, sum = 0;
		while (n > 0) {
			r = n % 10;// 3//5//1
			n = n / 10; // 15//1
			sum = sum + r * r * r;// 27+125=152+1=153
		}
		System.out.println(sum);
		if (temp == sum)

			System.out.println("number is not armstrong");

		else

			System.out.println("numberis armstrong");
	}
}
