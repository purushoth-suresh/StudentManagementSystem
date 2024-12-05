package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	
	private static List<Student> studentList;
	
	public static void main(String[] args) {
		System.out.println("********* Student Management System *********");
		System.out.println("********* Welcome *********");
		
		studentList = new ArrayList<Student>();
		
				
		Student s1;
		s1 = new Student("Kira Agar", 22, "S-1");
		s1.enrollCourse("Java");
		s1.enrollCourse("Devops");
		s1.enrollCourse("DSA");
		s1.enrollCourse("C#");
		
		
		Student s2 = new Student("Uday", 23, "S-11");
		s2.enrollCourse("Devops");
		
		Student s3 = new Student("rithik", 23, "S-21");
		s3.enrollCourse("DSA");
		
		Student s4 = new Student("Ani", 21, "S-08");
		s4.enrollCourse("Java");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		Student result = findStudentById("S-11");
		System.out.println("Result" + result);
		sortByName();
		
	}
	
	private static void sortByName() {
		
//		Without Lambda expression 
		
//		Comparator<Student> studentNameComparator = new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
		
//		With Lambda expression
		
		Comparator<Student> studentNameComparator = (o1,o2) -> o1.getName().compareTo(o2.getName());
		
		Collections.sort(studentList,studentNameComparator);
		System.out.println(studentList);
		
	}

	public static Student findStudentById(String studentId) {
		
		Student result = null;
		
		try {
		result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
		.findFirst()
		.orElseThrow(() -> new RuntimeException("No Data Found!!!"));
		} 
		catch(RuntimeException e) {
			System.err.println("Student with ID "+studentId+ " not found!!");
		}
		
		return result;
	}

}
