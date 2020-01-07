package Com.techlab.java;

import java.util.Scanner;

public class Scannerusing {
	   public static void main(String args[])
	    {
	        int a[] = new int[5];
	        int i;
	        float sum=0;
	        float avg, perc;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter  5 Subjects  marks: ");
	        for(i=0; i<5; i++)
	        {
	            a[i] = scan.nextInt();
	            sum = sum + a[i];
	        }
			
	        avg = sum/5;
	        perc = (sum/500) * 100;
			 System.out.println("sum= "+sum);
	        System.out.print("Average Marks = " +avg);
			
	        System.out.print("\nPercentage = " +perc+ "%");
	    }
	}


