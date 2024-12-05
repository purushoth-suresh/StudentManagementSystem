package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	
	private static List<Student> studentList;
	
	public static void main(String[] args) {
		System.out.println("********* Student Management System *********");
		System.out.println("********* Welcome *********");
		
		studentList = new ArrayList<Student>();
		

		// Read Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name :");
		String name = scanner.next();
		System.out.println("You have entered the name :" + name);
		
		//To read integer value from console/terminal
		// readInt();
		System.out.println("Enter Student Age :");
		int age = scanner.nextInt();
		System.out.println("The student age is :" + age);
		System.out.println("1. Register a Student");
		System.out.println("2. Find Student with studentID");
		System.out.println("3. List all student information");
		System.out.println("4. List Student information in sorted order");
		System.out.println("5. Exit");
		
		
		
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
