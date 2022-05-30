package com.Problem4;

public class Student {

	
	 int studentId ;

	 String courseEnrolled ;
	 int courseFee ;
	 
	 
	public Student(int studentId, String courseEnrolled, int courseFee) {
		super();
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}
	 
	 
}
