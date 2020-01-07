package Com.techlab.java;

public class AverageCommandline {
	 public static void main(String args[])
	  {
	  double avg=0;
	  double totalmarks=200;
	   double marks[]=new double[5];
	   marks[0]= Double.parseDouble(args[0]);
	  marks[1]= Double.parseDouble(args[1]);
	   marks[2]= Double.parseDouble(args[2]);
	   marks[3]= Double.parseDouble(args[3]);
	   marks[4]= Double.parseDouble(args[4]);
	   
	   double sum=0;
	   for(int i=0;i<marks.length;i++) {
		   sum=sum+marks[i];
		   
	   }
	   System.out.println("total marks of student =" + sum);
	  avg=(sum/marks.length);
	  System.out.println("average marks of five studen =" + avg);
	  double per=(sum/totalmarks)*100;
	  System.out.println("total percentage of five student=" + per);
}
}