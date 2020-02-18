package Com.techlab.java;

import java.util.Scanner;

public class TwoDigitNumber {
	public static void main(String[] args) {
			int Number, Count=0;
			Scanner sc=new Scanner (System.in);		
			System.out.println( "Please Enter any Number: ");
			Number = sc.nextInt();
			
			while(Number > 0) {
				Number = Number / 10;
				Count = Count + 1; 
			}
			System.out.format(" Number of Digits in a Given Number = %d", Count);

	}

}
