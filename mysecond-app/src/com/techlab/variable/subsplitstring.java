package com.techlab.variable;

public class subsplitstring {
public static void main(String[] args) {
	String queryString="www.java learner.com?developedby@ Govind yadav";
	String queryString2="www.java learner.com?developedby@ Govind yadav";
	
	System.out.println ("I AM Learning From:" +queryString.substring(4,16)); 
	String queryString3[]=queryString2.split("[?,@]");
	System.out.println(queryString3.length);
	System.out.println("which is :" +queryString3[1]);
	System.out.println("which is developed by :" +queryString3[2]);
	
	
	
}

}
