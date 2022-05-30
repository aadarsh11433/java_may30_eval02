package com.Problem2;

import java.util.Scanner;

public class Demo {
	
	
	 static void findAverage(Student[] students) {
		
		double sum = 0;
		
		for(int a =0;a<students.length;a++) {
			sum =sum+  students[a].getMarks();
		}
		
		double average = sum/students.length;
		
		System.out.println("the average marks are"+ average);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter no. of students");
		
		int number = sc.nextInt();
		
		Student[] students = new Student[number];
		
		for(int  a =0;a<number;a++) {
			
			System.out.println("Enter name of student"+(a+1));
			String name = sc.next();
			
			System.out.println("Enter address of student"+(a+1));
			String address = sc.next();
			
			
			System.out.println("Enter rollno. of student"+(a+1));
			int rollno = sc.nextInt();
			
			
			System.out.println("Enter marks of student"+(a+1));
			int marks = sc.nextInt();
			
			
			students[a]=  new Student(rollno, name, address, marks);
			
		}
		
		for(int a = 0;a< number; a++) {
			
			
			System.out.println("Name of the student "+(a+1)+students[a].getName());

			System.out.println("Rollno. of the student "+(a+1)+students[a].getRoll());
			
			System.out.println("Marks of the student "+(a+1)+students[a].getMarks());
			
			System.out.println("Address of the student "+(a+1)+students[a].getAddress());
			
			System.out.println(" <==================================>");
			
		}
		
		
		findAverage(students);
		
		
	}

}
