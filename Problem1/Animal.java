package com.Problem1;

public class Animal {

	 int legs= 4;
	 
	 Diseases disease;
	 
	 void habitat() {
		 System.out.println("lives in jungle");
	 }
}
class Diseases{
	String viral;
	String fungal;
	String Elergies;
	String Urinary;
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
 
 /*
           < --------------------------   Is-A relationship in java classes       ---------------------  >
 
           1. Is a relationship in java is established by extending some class to other class 
             -- like classs Cow is being Extended here to Animal (line 11).
             
             -- the class that has extended to some other class is called child class or sub-class.
             and the class to which aclss is exended is  the Parent or Super Class.
             
             Animal -Parent class
             Cow-    - Child class.
             
             even though the cow class doesnt have any data variable named  legs but it has accessed the variable from
              its parent class.
              
               Is A relation can be sum up in a way like Cow is an Animal.
 
 
  < --------------------------   Has-A relationship in java classes       ---------------------  >
 
 
      Has a relation 
 
 
 
 
 
 */