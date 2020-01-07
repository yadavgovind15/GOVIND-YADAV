package com.techlab.student.test;

import com.tecklabs.student.Student;

public class StudentTest { 
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=101;
		s1.name="govind";
		s1.display();
		
		Student s2=new Student();
		s2.id=203;
		s2.name="ramesh";
		s2.display();
	}

}
