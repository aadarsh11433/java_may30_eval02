package com.Problem1;

public class Main {

	public int x =100;
}

class Defolt{
	
}

class PrivateExample{
	protected int x = 10;
}

class ProtectedExample{
	private int x = 200;
}


/*
   <--------------------------------   Access modifiers and their accessibility ---------------------------------->


      1. Public  --  available in whole project across the Packages ;
                example -->
                
                 Main class above --> variable x.
                 
                 
      2. Default --  Availability is same as Public but in its own Package.
                  -- if we dont give any access modifier to any variable or method its default 
                     access modifier is Default .
      3. Private  -- only available in their respective classes 
                   -- access by only getter methods.
      4. Protected -- only              


*/