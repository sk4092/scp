package com.scoperesolution.pack2;

import com.scoperesolution.pack1.Parent;

public class NonChildInOtherPackage {

	public void displayVariables(){

		//System.out.println(staticVar);  
		//System.out.println(instanceVar);
	//non-child in other package cannot access static as well as instance variables in instance method 		
		
		System.out.println(Parent.staticVar);
		//non-child in other package can access static variables using class name or reference in instance method   
		
		Parent p=new Parent();
		System.out.println(p.instanceVar); 
		//non-child in other package can access instance variables using reference in instance method		
	}
	
	public static void staticDisplayVariables(){
		
		//System.out.println(staticVar);  
		//System.out.println(instanceVar);
		//non-child in other package cannot access static as well as instance variables in static method 		
		
		System.out.println(Parent.staticVar); //non-child in other package can access static 
		   							   		  //variable in static method using class name or reference
										  
		Parent p = new Parent();
		System.out.println(p.instanceVar);//child in other package can access instance 
										  //variable in static method using reference
	}
}
