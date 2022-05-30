package com.Problem1;

public class Animal {

	 int legs= 4;
	 
	 void habitat() {
		 System.out.println("lives in jungle");
	 }
}
class Cow extends Animal{
	
	
	void habitat() {
		 System.out.println("lives in jungle with a farmer");
	}
	
	
}
 class Main2 {
	  
	 public static void main(String[] args) {
			
			Cow cow1 = new Cow();
			cow1.habitat();
			
			System.out.println(cow1.legs);
		}
 }