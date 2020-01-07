package com.techlab.variable;

public class sortarray2 {
	public static void main(String args[])
	{
		  int arr[]= {2,5,1,3,8,4,6,9,7};
		  for( int i=1;i<=9;i++)
		  {
			  for( int j=0;j<=(9-1);j++)
			  {
				  int k=j+1;
				  int a=arr[j];
				  int  b=arr[k];
				  if(b<a)
				  {
					 arr[j]=b;
					 arr[k]=a;
					  
				  }
			  }
			  System.out.println(arr[i]);
			  
			  		 
		  }
}
}

	
	 