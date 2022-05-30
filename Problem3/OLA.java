package com.Problem3;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		System.out.println("booking a cab ");
		
		
		if(numberOfPassenger<=3) {
			
			HatchBack hatchCab = new HatchBack(15,numberOfPassenger,numberOfKMs);
					
			return hatchCab;
		}else {
			
			return new Sedan(20,numberOfPassenger,numberOfKMs);
		}
		
		
	}

	public int calculateBill(Car car) {
		
		System.out.println("Calculating the fare ");
		if (car instanceof HatchBack) {
			
			int fare  = car.getNumberOfKms() * 15;
			return fare;
		}else {
			int fare  = car.getNumberOfKms() *20;
			return fare;
		}
		
	
	}
	
}
