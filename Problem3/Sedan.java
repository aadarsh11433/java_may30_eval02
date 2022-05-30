package com.Problem3;

public class Sedan extends Car{

	final int farePerKm ;

	public Sedan(int farePerKm,int passengers, int distance) {
		super(passengers,distance);
		this.farePerKm = farePerKm;
	}
	
		
}
