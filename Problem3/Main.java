package com.Problem3;


import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number of Passengers ");
		int passengers = sc.nextInt();
		
		System.out.println("Enter the distance in kms");
		int distance = sc.nextInt();
		
		
		OLA cab = new OLA();
		 Car cabBooked  = cab.bookCar(passengers, distance);
		
	    int fare =	cab.calculateBill(cabBooked);
		
		System.out.println("Total fare for the journey is : "+ fare);
		
		
	}
	
	
	
	
}
