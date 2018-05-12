package com.scoperesolution.pack2;

import com.scoperesolution.pack1.Parent;

public class ChildInOtherPackage extends Parent {
	
	public void displayVariables(){
		System.out.println(staticVar);  
		System.out.println(instanceVar); //child in other package can access static 
										 //as well as instance variables in instance method 		
	}
	
	public static void staticDisplayVariables(){
		System.out.println(staticVar); //child in other package can access static 
		   							   //variable in static method 
		//System.out.println(instanceVar);//child in other package cannot access instance 
		   									//variable in static method without reference
										  
		Parent p = new Parent();
		System.out.println(p.instanceVar);//child in other package can access instance 
										  //variable in static method with reference
	}
}
