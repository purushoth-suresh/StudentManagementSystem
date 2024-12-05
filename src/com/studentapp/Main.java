package com.studentapp;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("********* Student Management System *********");
		System.out.println("********* Welcome *********");
		
		Student s1;
		s1 = new Student("Kira Agar", 22, "S-1");
		s1.enrollCourse("Java");
		s1.enrollCourse("Devops");
		s1.enrollCourse("DSA");
//		s1.enrollCourse("C#");
		
		System.out.println(s1);
//		s1.printStudentInfo();
		
		Student s2 = new Student("Uday", 23, "S-11");
		s2.enrollCourse("Devops");
		System.out.println(s2);
		
		Student s3 = new Student("Uday", 23, "S-21");
		s3.enrollCourse("DSA");
		System.out.println(s3);
		
	}

}
